package com.app.springboot.thymeleafdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.Employee;
@Repository
public interface EmployeRepository extends JpaRepository<Employee, Integer>{

}
