package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeServiceImplementation;

@RestController
@RequestMapping("/empdb")
public class EmployeeController {
	
	@Autowired
	EmployeeServiceImplementation service;
	
	@PostMapping("/createemp")
	public Employee createEmployee(@RequestBody Employee employee) {
		return service.createEmp(employee);
	}
	
	@PutMapping("/updateemp")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return service.updateEmp(employee);
	}
	
	@DeleteMapping("/deleteemp/{id}")
	public String deleteEmployee(@PathVariable int id) {
		return service.deleteEmp(id);
	}
	
	@GetMapping("/allemployees")
	public List<Employee> getAllEmployees() {
		return service.fetchAllEmployees();
	}
	
	@GetMapping("/getemp/{id}")
	public  Employee getEmployeeById(@PathVariable int id) {
		return service.getEmpById(id);
	}
	
}














