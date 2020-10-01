package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/showPage")
	public String showPage() {
		return "showThatPage";
	}
	
	@RequestMapping("/ProcessForm")
	public String processForm() {
		return "processform";
	}
	
	
	@RequestMapping("/ProcessFormVersionTwo")
	public String shoutTheName(HttpServletRequest req , Model model ) {
		
		String request = req.getParameter("StudentName");
		
		request =  "Yo!!! " + request.toUpperCase();
		
		model.addAttribute("message", request);
		
		
		return "processform";
	}

}
