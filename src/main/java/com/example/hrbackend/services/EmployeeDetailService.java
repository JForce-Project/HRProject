package com.example.hrbackend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrbackend.entities.EmployeeDetail;
import com.example.hrbackend.repo.EmployeeDetailRepository;



@Service
public class EmployeeDetailService implements IEmployeeDetailService {
	
	@Autowired
	EmployeeDetailRepository employeeDetailRepository;

	@Override
	public void saveEmployeeDetail(EmployeeDetail employeeDetail) {
		employeeDetailRepository.save(employeeDetail);
		
	}

	@Override
	public List<EmployeeDetail> getList() {
		return employeeDetailRepository.findAll();
	}

}
