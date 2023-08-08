package com.example.StudentCrud.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	private String studentname;
	private String course;
	private int fee;
	private String address;

	public Student() {

	}

	public Student(String id, String studentname, String course, int fee, String address) {
		super();
		this.id = id;
		this.studentname = studentname;
		this.course = course;
		this.fee = fee;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
