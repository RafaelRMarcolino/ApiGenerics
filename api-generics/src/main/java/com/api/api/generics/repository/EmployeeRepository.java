package com.api.api.generics.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.api.generics.entities.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
// teste