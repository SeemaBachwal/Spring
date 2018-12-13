package com.springmvcdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "first-page";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "student-form";
	}
	
	
	// controller to read form data and add data to the model
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		String theName = request.getParameter("studentName");
		theName = theName.toUpperCase();
		String sendmsg = "Hey !!  " + theName;
		model.addAttribute("message" , sendmsg);
		
		return "student-form";
	}
	
	// controller to read form data and add data to the model using @RequestParam
	// the below method when compared to aboe the difference is 
	// letsShoutDude(HttpServletRequest) and String theName = request.getParameter("studentName");
	// changed to one line @RequestParam("studentName") String theName
	
	@RequestMapping("/processFormVersionThree")
	public String letsShoutDudeiInDiffWay(@RequestParam("studentName") String theName, Model model) {
		
		theName = theName.toUpperCase();
		String sendmsg = "Hey My Friend using @RequestParam  !!  " + theName;
		model.addAttribute("message" , sendmsg);
		
		return "student-form";
	}

}
