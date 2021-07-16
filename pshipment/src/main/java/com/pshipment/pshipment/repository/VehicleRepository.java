package com.pshipment.pshipment.repository;

import java.util.List;

import com.pshipment.pshipment.model.Vehicle;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository  extends JpaRepository<Vehicle, Integer>{
    @Query(value="SELECT v FROM Vehicle v WHERE v.carrier =:carrier")
    List<Vehicle> findByCarrier(@Param("carrier") int carrier);
    
}