package com.example.hrbackend.services;


import java.util.List;

import com.example.hrbackend.entities.Employee;

public interface IEmployeeService {
	
	void saveEmployee(Employee employee);
	
	List<Employee> getList();

}
