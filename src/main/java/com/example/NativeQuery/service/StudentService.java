package com.example.NativeQuery.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.NativeQuery.entity.Address;
import com.example.NativeQuery.entity.Student;
import com.example.NativeQuery.entity.StudentDto;
import com.example.NativeQuery.repo.StudentRepo;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
@org.springframework.transaction.annotation.Transactional
public class StudentService implements StudentRepo {

	@PersistenceContext
	EntityManager manager;

	@Override
	public List<StudentDto> getAllStudents() {
		ModelMapper mapper = new ModelMapper();
		List<Student> list = manager.createNamedQuery("getAllStudents", Student.class).getResultList();
		mapper.map(Student.class, StudentDto.class);
		List<StudentDto> sdDto = Arrays.asList(mapper.map(list, StudentDto[].class));
		log.info("This details from StudentDto"+sdDto);
		return sdDto;
	}
	public void saveStudent(Student student,Address address) {
		manager.persist(student);
		manager.persist(address);
	}

}
