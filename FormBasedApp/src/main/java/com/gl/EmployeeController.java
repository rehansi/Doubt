package com.gl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gl.pojo.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@RequestMapping("/registration_form")
	public String ShowRegistrationForm(Model themodel) {

		Employee employee = new Employee();
		themodel.addAttribute("EmployeeModel", employee);
		return "employee_form";
	}
}
