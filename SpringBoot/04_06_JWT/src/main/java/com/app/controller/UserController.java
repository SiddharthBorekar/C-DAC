package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder.BCryptVersion;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.User;
import com.app.service.JwtService;
import com.app.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userservice;

	private BCryptPasswordEncoder byBCryptPasswordEncoder = new BCryptPasswordEncoder(12);

	// private BCryptPasswordEncoder byBCryptPasswordEncoder1 = new
	// BCryptPasswordEncoder(BCryptVersion.$2A,12);

	@PostMapping("/register")
	public User register(@RequestBody User user) {
		System.out.println("User: " + user);
		user.setPassword(byBCryptPasswordEncoder.encode(user.getPassword()));

		System.out.println(user.getPassword());
		return userservice.saveUser(user);
	}

	@GetMapping("/test")
	public String test() {
		return "working";
	}

	@Autowired
	AuthenticationManager authenticationManager;
	@Autowired
	private JwtService jwtService;

	@PostMapping("/login")
	public String login(@RequestBody User user) {
		Authentication authentication = authenticationManager
				.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));
		if(authentication.isAuthenticated()) {
			return jwtService.generateToken(user.getUsername());
			//return "Sucessfull Login";
		}else {
			return "Failed to Login";
		}
	}

}
