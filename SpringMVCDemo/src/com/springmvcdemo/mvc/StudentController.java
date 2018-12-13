package com.springmvcdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		// create new student object
		Student theStudent = new Student();
		
		// add student object to the Model
		theModel.addAttribute("student", theStudent);
		
		return "student-form-again";
		
	}
	
	// below method implementation when compared with the above
	// the difference is that
	// showForm(Model theModel) AND 
	// Student theStudent = new Student();  and theModel.addAttribute("student", theStudent);
	// has been replaced by single Annotation processForm(@ModelAttribute("student") Student theStudent)
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		System.out.println("The Student name is "+theStudent.getFirstName() +" "+theStudent.getLastName());
		return "student-confirmation";
		
	}
}
