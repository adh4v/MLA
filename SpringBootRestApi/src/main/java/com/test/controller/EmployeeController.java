package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.Service.EmployeeService;
import com.test.model.Employee;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	@PostMapping(value= "/empcreate",consumes = "application/json")
	public List<Employee> createEmp(@RequestBody Employee emp)
	{
		int i = service.readAllEmp().size()+1;
		emp.setId(i);
		service.createEmp(emp);
		return service.readAllEmp();
	}
	@GetMapping(value="/readall",produces="application/json")
	public List<Employee> getAllEmployees()
	{
		return service.readAllEmp();
	}
	@PutMapping(value = "/update/{id}",consumes = "application/json")
	public List<Employee> updateEmployee( @RequestBody Employee emp,@PathVariable("id")int id)
	{
		emp.setId(id);
		service.updateEmp(emp);
		return service.readAllEmp();
	}
	@DeleteMapping(value="/delete/{id}",produces ="application/json")
	public List<Employee> deleteEmployee(@PathVariable("id")int id)
	{
		service.deleteEmp(id);
		return service.readAllEmp();
	}
}
