package com.amdocs.cargoManagementSystem.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amdocs.cargoManagementSystem.entities.Driver;


public interface DriverRepo extends JpaRepository<Driver, Integer> {
    
	   
}
