package com.example.NativeQuery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.NativeQuery.entity.Address;
import com.example.NativeQuery.entity.Student;
import com.example.NativeQuery.entity.StudentDto;
import com.example.NativeQuery.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService service;

	@RequestMapping(value = "/getData")
	public List<StudentDto> getData() {
		return service.getAllStudents();
	}

	@RequestMapping(value = "/add")
	public void saveData( @RequestBody Student student, Address address) {
		service.saveStudent(student,address);
	}

}
