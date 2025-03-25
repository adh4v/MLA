package com.test.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.Repsository.CustomerRepository;
import com.test.dao.CustomerDao;
import com.test.entity.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao
{
	@Autowired
	private CustomerRepository repository;

	public void setRepository(CustomerRepository repository) {
		this.repository = repository;
	}

	@Override
	public Customer createCustomer(Customer cus) {
		return repository.save(cus);
	}

	@Override
	public List<Customer> readAllCustomers() {
		return repository.findAll();
	}

	@Override
	public List<Customer> updateCustomers(Customer cus) {
		repository.save(cus);
		return repository.findAll();
	}

	@Override
	public List<Customer> deleteCustomer(int id) {
		repository.deleteById(id);
		return repository.findAll();
				
	}
	
	
}	
