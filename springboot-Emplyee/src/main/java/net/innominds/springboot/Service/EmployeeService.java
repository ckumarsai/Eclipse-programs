package net.innominds.springboot.Service;

import java.util.List;

import net.innominds.springboot.entity.Employee10;

public interface EmployeeService {
	Employee10 saveEmployee(Employee10 employee);
	List<Employee10> getAllEmployee();
	Employee10 getEmployeeById(long id);
	Employee10 updateEmployee10(Employee10 employee, long id);
	void deleteEmployee10(long id);
	

}
