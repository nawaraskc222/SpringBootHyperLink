package com.DemoSpring.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller


public class DemoContoller2 {
	@GetMapping("/Page2")
	public String page2() {
		return  "page2.jsp";		
	}
}
