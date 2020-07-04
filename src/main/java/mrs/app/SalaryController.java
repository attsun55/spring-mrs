package mrs.app;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mrs.domain.service.TermService;

@Controller
@RequestMapping("salary")
public class SalaryController {
	
	@Autowired
	TermService termService;

	@RequestMapping(value="view")
	String view(Model model) {
		
		
		
		
		
//		int id = termService.select();
		
//		LocalDate today = LocalDate.now();
//		model.addAttribute("date", today);
//		model.addAttribute("id", id);
		return "salary/view";
		
	}
}	