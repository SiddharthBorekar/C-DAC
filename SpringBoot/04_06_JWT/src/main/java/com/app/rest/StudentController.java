package com.app.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Student;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class StudentController {

	List<Student> list = new ArrayList<>(
			List.of(new Student(1, "sai", "Java"), new Student(2, "Ashish", "WPT"), new Student(2, "Ishwar", "CPP")));
	
	@GetMapping("/students")
	public List<Student> getAllStd(){
		return list;
	}
	@PostMapping("/students")
	public void addStudent(@RequestBody Student std) {
		list.add(std);
	}
	@GetMapping("csrf-token")
	public CsrfToken getCSRFToken(HttpServletRequest request) {
		return (CsrfToken) request.getAttribute("_csrf");
	}

}
