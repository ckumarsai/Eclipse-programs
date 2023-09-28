package net.innominds.springboot.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import net.innominds.springboot.Service.EmployeeService;
import net.innominds.springboot.entity.Employee10;
import net.innominds.springboot.exceptoin.ResourceNotFoundException;
import net.innominds.springboot.repository.Employee10Repository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	private Employee10Repository employee10Repository;
	
	public EmployeeServiceImpl(Employee10Repository employee10Repository) {
		super();
		this.employee10Repository = employee10Repository;
	}

	@Override
	public Employee10 saveEmployee(Employee10 employee) {
		return employee10Repository.save(employee);
	}

	@Override
	public List<Employee10> getAllEmployee() {
		return employee10Repository.findAll();
	}

	@Override
	public Employee10 getEmployeeById(long id) {
//		Optional<Employee10> employee=employee10Repository.findById(id);
//		if(employee.isPresent()) {
//			return employee.get();
//		}else {
//			throw new ResourceNotFoundException("Employee10", "Id", id);
//		}
		//above method in lamda expression  
		return employee10Repository.findById(id).orElseThrow(() ->
		              new ResourceNotFoundException("Employee", "id", id));
	}

	@Override
	public Employee10 updateEmployee10(Employee10 employee, long id) {
		// we need to check whether emp with given is exist in DB or not
		Employee10 existingemployee=employee10Repository.findById(id).orElseThrow(
				()->    new ResourceNotFoundException("Employee", "id", id));
		
		existingemployee.setFirstname(employee.getFirstname());
		existingemployee.setLastname(employee.getLastname());
		existingemployee.setEmail(employee.getEmail());
		
		
		//Save existing employee to DB
		employee10Repository.save(existingemployee);
		   
		return existingemployee;
	}

	@Override
	public void deleteEmployee10(long id) {
		//check whether employee exist in DB or not
		employee10Repository.findById(id).orElseThrow(()->
		      new ResourceNotFoundException("Employee", "id", id));
		
		employee10Repository.deleteById(id);
		
	}	
		
}
