package com.app.springboot.thymeleafdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.entity.Employee;
import com.app.springboot.thymeleafdemo.dao.EmployeRepository;


@Service
public class EMployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeRepository employeRepository;
	
	
	@Override
	@Transactional
	public List<Employee> findAll() {
		return employeRepository.findAll();
	}

	@Override
	@Transactional
	public Employee findById(int theId) {
		Optional<Employee> result= employeRepository.findById(theId);
		Employee theEmployee = null;
		
		if (result.isPresent()) {
			theEmployee = result.get();
		}else {
			throw new RuntimeException("Did not Find Employee id = "+""+theId);
		}
		return theEmployee;
	}

	@Override
	@Transactional
	public void save(Employee theEmployee) {
		employeRepository.save(theEmployee);
	}

	@Override
	@Transactional
	public void deletebyId(int theID) {
		employeRepository.deleteById(theID);
	}
}
