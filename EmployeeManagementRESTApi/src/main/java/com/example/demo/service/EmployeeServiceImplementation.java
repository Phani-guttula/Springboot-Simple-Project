package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImplementation implements EmployeeService{

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public Employee createEmp(Employee employee) {
		return employeeRepository.save(employee);
		
	}

	@Override
	public Employee updateEmp(Employee employee) {
		return employeeRepository.save(employee);
		
	}

	@Override
	public String deleteEmp(int id) {
		employeeRepository.deleteById(id);
		return "ID: " + id + " Deleted Successfully!";
		
	}

	@Override
	public Employee getEmpById(int id) {
		return employeeRepository.findById(id).orElse(null);
		
	}

	@Override
	public List<Employee> fetchAllEmployees() {
		return employeeRepository.findAll();
		
	}

}
