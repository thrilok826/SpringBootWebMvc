package in.nit.raghu.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import in.nit.raghu.model.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;

@Controller
@RequestMapping("/employee")
@Data
@AllArgsConstructor
public class EmployeeController {
	
	@GetMapping("/show")
	public String ShowEmployee(Model model)
	{
		model.addAttribute("eid",101);
		model.addAttribute("empName", "Thrilok");
		model.addAttribute("esal",200.0);
		
		model.addAttribute("eob",new Employee(102,"raju","Dev"));
		
		model.addAttribute("list",Arrays.asList(
				                                                                new Employee(104,"Vinay","Dav"),
				                                                                new Employee(104,"Vinay","QA"),
				                                                                new Employee(104,"Vinay","BA")
				                                                                ));
			return "EmpData";
	}

}
