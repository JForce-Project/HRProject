package com.example.hrbackend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrbackend.entities.Inventory;
import com.example.hrbackend.repo.InventoryRepository;

@Service
public class InventoryService implements IInventoryService {

	@Autowired
	InventoryRepository inventoryRepository;
	
	@Override
	public void saveInventory(Inventory inventory) {
		inventoryRepository.save(inventory);
		
	}

	@Override
	public List<Inventory> getList() {
		return inventoryRepository.findAll();
	}
	

}
