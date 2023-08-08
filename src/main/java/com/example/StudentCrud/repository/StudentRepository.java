package com.example.StudentCrud.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.StudentCrud.domain.Student;

public interface StudentRepository extends CrudRepository<Student, String> {

}
