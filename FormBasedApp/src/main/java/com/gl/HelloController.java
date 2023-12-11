package com.gl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String Welcome(ModelMap model) {
       
		model.addAttribute("message", "hello and welcome to the project");
		return ("hello");
	}
}
