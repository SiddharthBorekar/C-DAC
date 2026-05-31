package com.app.service;

import java.util.List;

import com.app.entity.Customer;

public interface CustomerServices {
	public List<Customer> getCustomers();
	
	public void saveCustomer(Customer theCustomer);
	
	public Customer getCustomer(int thId);
	
	public void deleteCustomer(int thrId);
	
}
