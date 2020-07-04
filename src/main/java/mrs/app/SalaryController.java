package mrs.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import mrs.domain.model.Kintai;
import mrs.domain.service.KintaiService;
import mrs.domain.service.TermService;

@Controller
@RequestMapping("salary")
public class SalaryController {
	
	@Autowired
	TermService termService;

	@Autowired
	KintaiService kintaiService;
	
	@RequestMapping(value="view")
	String view(Model model) {
		
		// 
		Kintai kintai = kintaiService.findKintai("01", 202006);
		
		return "salary/view";
		
	}
	
	@RequestMapping(value="edit")
	String edit(Model model) {
		
		// 
//		Kintai kintai = kintaiService.findKintai("01", 202006);
		
		return "salary/edit";
		
	}	
	
	
}	