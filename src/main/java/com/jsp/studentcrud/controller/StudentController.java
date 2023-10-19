package com.jsp.studentcrud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.studentcrud.dto.Student;

@RestController
public class StudentController {
//	@GetMapping("/one")
//	public String abc() {
//		return "ABC";
//	}
	@PostMapping("/students")
	public Student saveStudents(@RequestBody Student student) {
		return student;
		
	}
	

}
