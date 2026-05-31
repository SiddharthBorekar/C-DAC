package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.entity.Customer;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/Customer")
public class CustomerController {
	
	@RequestMapping("/ShowForm")
	public String CustomerForm(Model theModel) {
		Customer cust = new Customer();
		theModel.addAttribute("theCustomer", cust);
		return "Customer-form";
	}

	@RequestMapping(path= "/process", method = RequestMethod.POST)
	public String processForm(@Valid @ModelAttribute("theCustomer") Customer customer, BindingResult theBindingResult) {
		System.out.println("Customer");
		if (theBindingResult.hasErrors()) {
			return "Customer-form";
		} else {
			return "Customer-Confirmation";
		}
	}
}
