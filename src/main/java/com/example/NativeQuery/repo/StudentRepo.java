package com.example.NativeQuery.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

import com.example.NativeQuery.entity.Address;
import com.example.NativeQuery.entity.Student;
import com.example.NativeQuery.entity.StudentDto;

@Repository
public interface StudentRepo{
	
	List<StudentDto> getAllStudents();
	void saveStudent(Student student,Address address);
	
	
	

}
