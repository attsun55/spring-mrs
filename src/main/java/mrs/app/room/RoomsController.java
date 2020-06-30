package mrs.app.room;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;
import org.apache.pdfbox.text.PDFTextStripper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mrs.domain.model.ReservableRoom;
import mrs.domain.service.room.RoomService;

@Controller
@RequestMapping("rooms")
public class RoomsController {
	@Autowired
	RoomService roomService;

	@RequestMapping(value = "{date}", method = RequestMethod.GET)
	String listRooms(@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) @PathVariable("date") LocalDate date, Model model) {
		List<ReservableRoom> rooms = roomService.findReservableRooms(date);
		model.addAttribute("rooms", rooms);
		return "room/listRooms";
	}

	@RequestMapping(method = RequestMethod.GET)
	String listRooms(Model model) throws InvalidPasswordException, IOException {
		LocalDate today = LocalDate.now();
		model.addAttribute("date", today);

		File file = new File("C:\\tmp\\20200630.pdf");
		String password = "bm0GopkB";

		PDDocument document = PDDocument.load(file, password);
//		System.out.println("総ページ数：" + document.getNumberOfPages());

		// a取得する店舗一覧のページ
		int page = 1;

		PDFTextStripper stripper = new PDFTextStripper();
		stripper.setStartPage(page);
		stripper.setEndPage(page);
		String text = stripper.getText(document);

		System.out.println(text);

		return listRooms(today, model);
//		return "room/listRooms";

	}
}