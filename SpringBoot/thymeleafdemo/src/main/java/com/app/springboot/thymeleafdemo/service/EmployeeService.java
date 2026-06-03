package com.app.springboot.thymeleafdemo.service;

import java.util.List;

import com.app.entity.Employee;

public interface EmployeeService {
	public List <Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void  deletebyId(int theID);
	
}
