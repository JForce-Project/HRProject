package com.example.hrbackend.services;

import java.util.List;

import com.example.hrbackend.entities.Inventory;

public interface IInventoryService {

	
	void saveInventory(Inventory inventory);
	
	List<Inventory> getList();
	
}
