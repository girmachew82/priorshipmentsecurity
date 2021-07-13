package com.pshipment.pshipment.repository;

import java.util.List;

import com.pshipment.pshipment.dto.DriversforAnOrderDto;
import com.pshipment.pshipment.model.CarrierAssignDriver;
import com.pshipment.pshipment.model.Driver;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CarrierAssignDriverRepository extends JpaRepository<CarrierAssignDriver, Integer> {
    
  //@Query("SELECT new com.pshipment.pshipment.dto.DriversforAnOrder(d.driverId,d.firstName,d.middleName,d.lastName,d.phoneNumber) FROM CarrierAssignDriver c JOIN c.driverId d WHERE c.bidding=:biddingId")
  //@Query("SELECT d, c  FROM   Driver d, CarrierAssignDriver c  INNER JOIN Driver ON d.driverId = c.driverId WHERE c.bidding=:biddingId")
  @Query("SELECT c,d FROM  CarrierAssignDriver c, Driver d WHERE c.bidding=:biddingId")
  //@Query(value ="SELECT drivers.driver_id,drivers.first_name,drivers.last_name,drivers.middle_name,drivers.phone_number FROM    assign_drivers INNER JOIN drivers ON drivers.driver_id =assign_drivers.driver_id WHERE  assign_drivers.bidding_id = :biddingId",nativeQuery = true)
   List<DriversforAnOrderDto> getDriverforAnOrder(@Param("biddingId")  int biddingId);

}