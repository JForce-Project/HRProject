package com.example.hrbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrbackend.entities.Employee;
import com.example.hrbackend.services.IEmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	IEmployeeService iEmployeeService;

	@RequestMapping(value = "/getListEmployee", method = RequestMethod.GET)
	public List<Employee> getList() {

		return iEmployeeService.getList();
	}

	
	@RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
	
	public void save(@RequestBody Employee employee) {
		iEmployeeService.saveEmployee(employee);
	}
}
