package com.example.NativeQuery.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {

	private Long id;

	private String name;
	private String age;
	private Address address;
	@Override
	public String toString() {
		return "This Details From StudentDto  [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	

}
