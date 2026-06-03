package com.app.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	public class Demo{
		@GetMapping("/dateTime")
		public String getDateTime() {
			return LocalDateTime.now().toString();
		}
		
		@GetMapping("/hello/{id}")
		public String getyId(@PathVariable int id) {
			return "Id = " + id;
		}
	}
}
