package com.test.dao;

import java.util.List;

import com.test.model.Employee;

public interface EmployeeDao {
	
	public Employee createEmp(Employee emp);
	
	public String updateEmp(Employee emp);
	
	public List<Employee> readAllEmp();
	
	public String deleteEmp(Integer id);
}	
