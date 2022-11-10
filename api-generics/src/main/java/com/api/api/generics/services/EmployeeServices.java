package com.api.api.generics.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.api.api.generics.DTO.EmployeeDto;
import com.api.api.generics.entities.Employee;
import com.api.api.generics.repository.EmployeeRepository;

//T extends Convertible<DTO> TIPO CORINGA
@Service
public class EmployeeServices implements GenericServices<Employee, EmployeeDto, Long> {

	@Autowired
	public EmployeeRepository repo;

	@Override
	public JpaRepository<Employee, Long> getRepository() {
		return repo;
	}

}
