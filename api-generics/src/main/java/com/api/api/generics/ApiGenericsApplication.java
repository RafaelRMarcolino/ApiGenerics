package com.api.api.generics;



import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.api.api.generics.entities.Employee;
import com.api.api.generics.repository.EmployeeRepository;

@SpringBootApplication
public class ApiGenericsApplication implements CommandLineRunner  {

	@Autowired
	public EmployeeRepository employeeRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(ApiGenericsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Employee emp1 = new Employee(null, "James");
		Employee emp2 = new Employee(null, "James");
		
		employeeRepo.saveAll(Arrays.asList(emp1, emp2));
		
		
		
	}

}
