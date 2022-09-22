package com.example.hrbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrbackend.entities.EmployeeDetail;
import com.example.hrbackend.services.IEmployeeDetailService;

@RestController
public class EmployeeDetailController {
	
	
	@Autowired
	IEmployeeDetailService iEmployeeDetailService;
	
	@RequestMapping(value="/getListEmployeeDetail" , method=RequestMethod.GET)
	public List<EmployeeDetail> getList(){
		return iEmployeeDetailService.getList();
	}
	
	@RequestMapping(value="/saveEmployeeDetail" , method=RequestMethod.POST)
	public void saveEmployeeDetail(@RequestBody EmployeeDetail employeeDetail) {
		iEmployeeDetailService.saveEmployeeDetail(employeeDetail);
	}

	
	

}
