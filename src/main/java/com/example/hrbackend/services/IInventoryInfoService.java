package com.example.hrbackend.services;

import java.util.List;

import com.example.hrbackend.entities.InventoryInfo;

public interface IInventoryInfoService {
	
	
	
	void saveInventoryInfoService(InventoryInfo inventoryInfo);

	
	List<InventoryInfo> getList();
}
