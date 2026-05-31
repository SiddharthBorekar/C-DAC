package com.app.dao;

import java.util.List;

import com.app.entity.Customer;

public interface CustomerDAo {
	
public List<Customer> getCustomers();
	
	public void saveCustomer(Customer theCustomer);
	
	public Customer getCustomer(int thId);
	
	public void deleteCustomer(int thrId);
	
	
}
