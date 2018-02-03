package org.studyeasy.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller		//sub-class of Component
public class HelloController {

	@RequestMapping("/")
	public String homepage() {
		return "index";
	}
	
	@RequestMapping("/hello")
	public String printHello() {
		return "hello";
	}
}
