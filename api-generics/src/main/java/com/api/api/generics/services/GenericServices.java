package com.api.api.generics.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.api.generics.utils.Convertible;

//T extends Convertible<DTO> TIPO CORINGA
public interface GenericServices<T extends Convertible<DTO>, DTO, ID> {

	
	 JpaRepository<T, ID> getRepository();
	
	default DTO employeetById(ID id) {

		Optional<T> obj = getRepository().findById(id);

		return obj.get().convert();
	}

	default List<DTO> listAll() {

		List<T> list = getRepository().findAll();
		return list.stream().map(x -> x.convert()).collect(Collectors.toList());
	}
}
