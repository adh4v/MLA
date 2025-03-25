package com.test.Service;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.test.dao.EmployeeDao;
import com.test.model.Employee;
import com.test.model.Employees;

@Repository
@Service
public class EmployeeService implements EmployeeDao
{
	private static Employees empData = new Employees();
	
	static
	{
		empData.getEmpList().add(new Employee(1,"Aki","CsR"));
		empData.getEmpList().add(new Employee(2,"Adhi","RuN"));
		empData.getEmpList().add(new Employee(3,"Siranjeevi","SoS"));
		empData.getEmpList().add(new Employee(4,"Deva","LoL"));
		empData.getEmpList().add(new Employee(5,"Kin","PoP"));
	}

	@Override
	public Employee createEmp(Employee emp) {
		empData.getEmpList().add(emp);
		return emp;
	}

	@Override
	public String updateEmp(Employee emp) {
		for(int i=0;i<empData.getEmpList().size();i++)
		{
			Employee e = empData.getEmpList().get(i);
			
			if(e.getId().equals(emp.getId()))
			{
				empData.getEmpList().set(i,emp);			
			}
		}
		
		return "This Given Id is not available";
	}

	@Override
	public List<Employee> readAllEmp() {
		return empData.getEmpList();
	}

	@Override
	public String deleteEmp(Integer id) {
		for(int i=0;i<empData.getEmpList().size();i++)
		{
			Employee e = empData.getEmpList().get(i);
			if(e.getId().equals(id))
			{
				empData.getEmpList().remove(i);
			}
		}
		return "This Given Id is not available";
	}
	
	

}
