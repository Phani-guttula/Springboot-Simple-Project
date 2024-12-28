package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;

public interface StudentService {

	public Student createStudent(Student student);
	public Student updateStudent(Student student);
	public String deleteStudent(int id);
	public List<Student> fetchStudents();
	public Student getStudentById(int id);
}
