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
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentServiceImplementation;

@RestController
@RequestMapping("/studb")
public class StudentController {
	
	@Autowired
	StudentServiceImplementation service;
	
	@PostMapping("/createstu")
	public Student createStudent(@RequestBody Student student) {
		return service.createStudent(student);
	}
	
	@PutMapping("/updatestu")
	public Student updateStudent(@RequestBody Student student) {
		return service.updateStudent(student);
	}
	
	@DeleteMapping("/deletestu/{id}")
	public String deleteStudent(@PathVariable int id) {
		return service.deleteStudent(id);
	}
	
	@GetMapping("/allstudents")
	public List<Student> getAllStudents() {
		return service.fetchStudents();
	}
	
	@GetMapping("/getstu/{id}")
	public  Student getStudentById(@PathVariable int id) {
		return service.getStudentById(id);
	}
}
