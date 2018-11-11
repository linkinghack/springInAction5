package com.linkinghack.taco.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return "home"; //view name
		// 默认情况下view name 的prefix = /templates/
		// postfix = .html
	}
}
