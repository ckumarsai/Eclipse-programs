package net.innominds.springboot.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.innominds.springboot.Service.EmployeeService;
import net.innominds.springboot.entity.Employee10;

@RestController
@RequestMapping("/api/employee10")
public class Employee10Controller {
	private EmployeeService employeeService;

	public Employee10Controller(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
     //build  create employee REST API
	@PostMapping()
	public ResponseEntity<Employee10> saveEmployee(@RequestBody Employee10 employee){
		return new ResponseEntity<Employee10>(employeeService.saveEmployee(employee),HttpStatus.CREATED);
	}
	
	//build all employee10 REST API
	@GetMapping
	public  List<Employee10> getAllEmloyees(){
		return employeeService.getAllEmployee();
	}
	
	//build get employee by ID REST API
	//http://localhost:8080/api/employee/1
	
	@GetMapping("{id}")
	public ResponseEntity<Employee10> getEmployeeById(@PathVariable("id")long id){
		return new ResponseEntity<Employee10>(employeeService.getEmployeeById(id),HttpStatus.OK);
	}
	
	//biuld update emp REST API
	//http://localhost:8080/api/employee/1
	
	@PutMapping("{id}")
	public ResponseEntity<Employee10> updateEmployee10(@PathVariable("id") long id
			                                           ,@RequestBody Employee10 employee)
	{
		return new ResponseEntity<Employee10>(employeeService.updateEmployee10(employee, id),HttpStatus.OK);
	}
	
	//build delete emp  REST API
	//http://localhost:8080/api/employee/1
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteEmployee10(@PathVariable("id") long id){
		
		//Delete emp  from DB
		employeeService.deleteEmployee10(id);
		
		return new ResponseEntity<String>("Employee deleted successfully!.",HttpStatus.OK);
	}
}


