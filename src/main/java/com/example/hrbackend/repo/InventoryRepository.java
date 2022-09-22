package com.example.hrbackend.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hrbackend.entities.Inventory;


@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long>{

}
