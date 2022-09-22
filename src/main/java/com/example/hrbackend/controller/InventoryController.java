package com.example.hrbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrbackend.entities.Inventory;
import com.example.hrbackend.services.IInventoryService;

@RestController
public class InventoryController {
	@Autowired
	IInventoryService iInventoryService;
	
	
	@RequestMapping(value="/getListInventory", method=RequestMethod.GET)
	public List<Inventory> getList(){
		return iInventoryService.getList();
	}
	
	
	@RequestMapping(value="/saveInventory", method=RequestMethod.POST)
	public void save(@RequestBody Inventory inventory) {
		iInventoryService.saveInventory(inventory);
	}

	

}
