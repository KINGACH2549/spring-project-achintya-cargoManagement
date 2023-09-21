package com.amdocs.cargoManagementSystem.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amdocs.cargoManagementSystem.entities.Driver;
import com.amdocs.cargoManagementSystem.entities.RouteEntity;

@Repository
public interface RouteRepository extends JpaRepository<RouteEntity, Integer> {
       
//    List<RouteEntity> findByDriver(Driver driver);
//    RouteEntity findByDriverandRouteId(Driver driver , int routeid);

}
