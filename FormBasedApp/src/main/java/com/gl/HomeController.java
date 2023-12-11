package com.gl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
   
	@RequestMapping("/")
	public String ShowHomePage() {
		return "main_page" ;
	}
}
