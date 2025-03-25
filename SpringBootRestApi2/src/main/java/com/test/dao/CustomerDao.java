package com.test.dao;

import java.util.List;

import com.test.entity.Customer;

public interface CustomerDao {
	
	public Customer createCustomer(Customer cus);
	
	public List<Customer> readAllCustomers();
	
	public List<Customer> updateCustomers(Customer cus);
	
	public List<Customer> deleteCustomer(int id);
}
