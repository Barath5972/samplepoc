   
package com.example.StudentCrud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.StudentCrud.domain.Student;
import com.example.StudentCrud.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/students")
	public List<Student> getAllStudentss() {
		return studentService.getAllStudents();
	}

	@GetMapping("/students/{id}")
	public Optional<Student> getAStudent(@PathVariable String id) {
		return studentService.getAStudent(id);
	}

	
	@PostMapping(path = "/students")
	public void addStudent(@RequestBody Student student) {
		studentService.addStudent(student);
	}
	
	

	@PutMapping(path = "/students/{id}")
	public void updateStudent(@RequestBody Student student, @PathVariable Long id) {
		studentService.updateStudent(id, student);
	}

	@DeleteMapping(path = "/students/{id}")
	public void deleteStudent(@PathVariable String id) {
		studentService.deleteStudent(id);
	}
}
