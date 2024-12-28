package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImplementation implements StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public Student createStudent(Student student) {
		return studentRepository.save(student);		
		
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
		
	}

	@Override
	public String deleteStudent(int id) {
		studentRepository.deleteById(id);
		return "ID: " + id + " Deleted Successfully!";
		
	}

	@Override
	public List<Student> fetchStudents() {
		return studentRepository.findAll();
		
	}

	@Override
	public Student getStudentById(int id) {
		return studentRepository.findById(id).orElse(null);
		
	}

}
