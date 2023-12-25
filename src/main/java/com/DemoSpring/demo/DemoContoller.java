package com.DemoSpring.demo;

import org.springframework.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoContoller {
	
	@GetMapping("/Page1")
	public String page1() {
		return  "page1.jsp";		
	}

//	@GetMapping("/Page2")
//	public String page2() {
//		return  "page2.jsp";		
//	}
}
