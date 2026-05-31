package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.entity.Student;

@Controller
@RequestMapping("/Student")
public class StudentController {
	@RequestMapping("/ShowForm")
	public String ShowForm(Model theModel) {
		
		Student theStudent = new Student();
		theModel.addAttribute("theStudent",theStudent);
		return "Student-form";
	}
	
	@RequestMapping(path="/processForm", method=RequestMethod.POST)
	
	public String processForm(@ModelAttribute("theStudent")Student student)
	{
		System.out.println("Student Confirmed: "+student);
		return "Student-confirmation";
	}
	
}
