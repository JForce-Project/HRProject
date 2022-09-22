package com.example.hrbackend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrbackend.entities.InventoryInfo;
import com.example.hrbackend.repo.InventoryInfoRepository;

@Service
public class InventoryInfoService implements IInventoryInfoService{
	
	@Autowired
	InventoryInfoRepository inventoryInfoRepository;
	
	@Override
	public void saveInventoryInfoService(InventoryInfo inventoryInfo) {
		inventoryInfoRepository.save(inventoryInfo);
			
	}

	@Override
	public List<InventoryInfo> getList() {

		return inventoryInfoRepository.findAll();
	}

}
