package com.inovaitsys.multicrud.employee.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inovaitsys.multicrud.employee.model.Employee;
import com.inovaitsys.multicrud.employee.service.EmployeeService;
import com.inovaitsys.multicrud.response.model.Response;





@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;
	
	private static final Logger logger = LogManager.getLogger(EmployeeController.class);

	// Save employee to db
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Response> addEmployee(@RequestBody Employee employee) {
		logger.info("Add employee method working");
		return empService.saveEmployee(employee);

	}

	// Get all employee from db
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<Response> getEmployees() {
		logger.info("Get employees method working");
		return empService.getAllEmployees();

	}

	// Get particular employee based on the employee id
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public ResponseEntity<Response> getEmployee(@PathVariable int id) {
		logger.info("Get employee by id method working");	
			return empService.getEmployeeById(id);																								
	}

	// Delete employee from the db
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public ResponseEntity<Response> deleteEmployee(@PathVariable int id) {
		logger.info("Delete employee by id method working");
		return empService.deleteEmployeeById(id);
	}

	// Update the details of existing employee
	@RequestMapping(value="/{id}",method = RequestMethod.PUT)
	public ResponseEntity<Response> updateEmployee(@PathVariable int id, @RequestBody Employee employee) {
		logger.info("Update employees method working");		
		return empService.updateEmployeeDetails(id, employee);
	}

}
