package in.nit.raghu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@GetMapping("/show")
	public String ShowEmployee(Model model)
	{
		model.addAttribute("eid",101);
		model.addAttribute("empName", "Thrilok");
		model.addAttribute("esal",200.0);
		
		return "EmpData";
	}

}
