package com.example.StudentCrud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentCrud.domain.Student;
import com.example.StudentCrud.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public List<Student> getAllStudents() {
		List<Student> students = new ArrayList<>();
		studentRepository.findAll().forEach(students::add);
		return students;

	}

	public java.util.Optional<Student> getAStudent(String id) {
		return studentRepository.findById(id);

	}

	public void addStudent(Student student) {
		studentRepository.save(student);
	}

	public void updateStudent(Long id, Student student) {
		studentRepository.save(student);
	}

	public void deleteStudent(String id) {
		studentRepository.deleteById(id);
	}

}
