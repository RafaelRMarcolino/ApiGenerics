package com.api.api.generics.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.api.generics.DTO.EmployeeDto;
import com.api.api.generics.entities.Employee;
import com.api.api.generics.repository.EmployeeRepository;

@Service
public class EmployeeServices {

	@Autowired
	public EmployeeRepository repo;

	public EmployeeDto employeetById(Long id) {

		Optional<Employee> obj = repo.findById(id);

		return new EmployeeDto(obj.get());
	}

	public List<Employee> listAll() {

		return repo.findAll();
	}
	
	

	
}
