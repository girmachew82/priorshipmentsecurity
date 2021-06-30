package com.pshipment.pshipment.repository;

import com.pshipment.pshipment.model.Driver;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Integer>{
    
}