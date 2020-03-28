package mrs.app.room;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mrs.domain.service.room.TermService;

@Controller
@RequestMapping("terms")
public class TermsController {
	
	@Autowired
	TermService termService;

//	@RequestMapping(value = "{date}", method = RequestMethod.GET)
//	String listRooms(@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) @PathVariable("date") LocalDate date, Model model) {
//		List<ReservableRoom> rooms = roomService.findReservableRooms(date);
//		model.addAttribute("rooms", rooms);
//		return "room/terms";
//	}

	@RequestMapping(method = RequestMethod.GET)
	String listRooms(Model model) {
		
		int id = termService.select();
		
		LocalDate today = LocalDate.now();
		model.addAttribute("date", today);
		model.addAttribute("id", id);
		return "room/terms";
		
	}
}