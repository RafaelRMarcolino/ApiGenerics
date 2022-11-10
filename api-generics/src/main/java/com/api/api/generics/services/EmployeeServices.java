package com.api.api.generics.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.api.api.generics.utils.Convertible;

//T extends Convertible<DTO> TIPO CORINGA
@Service
public class EmployeeServices<T extends Convertible<DTO>, DTO, ID> {

	@Autowired
	private JpaRepository<T, ID> repository;
	

	public DTO employeetById(ID id) {

		Optional<T> obj = repository.findById(id);

		return obj.get().convert();
	}

	public List<DTO> listAll() {

		List<T> list = repository.findAll();
		return list.stream().map(x -> x.convert()).collect(Collectors.toList());
	}
	
	

	
}
