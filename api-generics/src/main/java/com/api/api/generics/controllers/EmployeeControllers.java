package com.api.api.generics.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.api.generics.DTO.EmployeeDto;
import com.api.api.generics.entities.Employee;
import com.api.api.generics.services.EmployeeServices;

@RestController
@RequestMapping("/employee")
public class EmployeeControllers {
	
	@Autowired
	public EmployeeServices service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<EmployeeDto> findById(@PathVariable Long id){
		
		EmployeeDto obj = service.employeetById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@GetMapping()
	public ResponseEntity<List<EmployeeDto>> findAll(){
		
		List<Employee> obj = service.listAll();
		List<EmployeeDto> listDto = obj.stream().map(x -> new EmployeeDto(x)).collect(Collectors.toList());

		return ResponseEntity.ok().body(listDto);

	}
	
	
	
	
	
}
