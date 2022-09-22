package com.example.hrbackend.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hrbackend.entities.InventoryInfo;


@Repository
public interface InventoryInfoRepository extends JpaRepository<InventoryInfo, Long>{

}
