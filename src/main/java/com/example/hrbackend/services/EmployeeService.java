package com.example.hrbackend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrbackend.entities.Employee;
import com.example.hrbackend.repo.EmployeeRepository;

@Service
public class EmployeeService implements IEmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	
	@Override
	public void saveEmployee(Employee employee) {

		employeeRepository.save(employee);
		
	}

	@Override
	public List<Employee> getList() {
		return employeeRepository.findAll();
	}
	
	

}
