package com.example.hrbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrbackend.entities.InventoryInfo;
import com.example.hrbackend.services.IInventoryInfoService;

@RestController
public class InventoryInfoController {
	
	@Autowired 
	IInventoryInfoService iInventoryInfoService;
	
	@RequestMapping(value="/getListInventoryInfo",method=RequestMethod.GET)
	public List<InventoryInfo> getList(){
		return iInventoryInfoService.getList();
	}
	
	@RequestMapping(value="/saveInventoryInfo",method=RequestMethod.POST)
		public void saveInventoryInfo(@RequestBody InventoryInfo inventoryInfo) {
		iInventoryInfoService.saveInventoryInfoService(inventoryInfo);
	}

}
