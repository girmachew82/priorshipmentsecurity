package com.pshipment.pshipment.repository;

import com.pshipment.pshipment.model.Carrier;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CarrierRepository extends JpaRepository<Carrier,Integer>{
    
}