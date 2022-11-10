package com.api.api.generics.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.api.api.generics.DTO.EmployeeDto;
import com.api.api.generics.utils.Convertible;

@Entity
@Table(name = "tb_employee")
public class Employee implements Convertible<EmployeeDto> {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	public Employee() {
		
	}

	public Employee(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
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


	// metodo que retorna o DTO copiando os dados do proprio objeto DTO
	@Override
	public EmployeeDto convert() {
		return new EmployeeDto(this);
	}
	
}
