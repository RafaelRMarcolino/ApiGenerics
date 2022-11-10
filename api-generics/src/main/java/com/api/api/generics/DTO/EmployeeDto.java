package com.api.api.generics.DTO;

import com.api.api.generics.entities.Employee;

public class EmployeeDto {

	private Long id;
	
	private String name;
	
	
	public EmployeeDto() {
		
	}
	
	public EmployeeDto(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public EmployeeDto(Employee obj) {
		super();
		this.id = obj.getId();
		this.name = obj.getName();
	
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
