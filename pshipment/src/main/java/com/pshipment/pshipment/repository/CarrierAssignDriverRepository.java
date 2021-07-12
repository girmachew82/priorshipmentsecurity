package com.pshipment.pshipment.repository;

import java.util.List;

import com.pshipment.pshipment.dto.DriversforAnOrder;
import com.pshipment.pshipment.model.CarrierAssignDriver;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CarrierAssignDriverRepository extends JpaRepository<CarrierAssignDriver, Integer> {
    
    @Query("SELECT new com.pshipment.pshipment.dto.DriversforAnOrder(d.driverId,d.firstName,d.middleName,d.lastName,d.phoneNumber) FROM Driver d  WHERE d.driverId =:orderId")
    List<DriversforAnOrder> getDriverforAnOrder(@Param("orderId") int orderId);

}