package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeService {

	/*
	 * we need 5 methods
	 * 1. create
	 * 2. update
	 * 3. getAll
	 * 4. delete
	 * 5. get emp by id
	 */
	
	public Employee createEmp(Employee employee);
	public Employee updateEmp(Employee employee);
	public String deleteEmp(int id);
	public Employee getEmpById(int id);
	public List<Employee> fetchAllEmployees();
}
