package com.example.hrbackend.services;

import java.util.List;

import com.example.hrbackend.entities.EmployeeDetail;

public interface IEmployeeDetailService {
	
	void saveEmployeeDetail(EmployeeDetail employeeDetail);
	
	List<EmployeeDetail> getList();

}
