package com.pshipment.pshipment.repository;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.pshipment.pshipment.dto.AwardedCarrierDto;
import com.pshipment.pshipment.dto.AwardedCarrierOfAnOrderDto;
import com.pshipment.pshipment.dto.BiddingByCarrier;
import com.pshipment.pshipment.dto.CarrierDto;
import com.pshipment.pshipment.model.Carrier;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface CarrierRepository extends JpaRepository<Carrier,Integer>{
    @Query("SELECT new com.pshipment.pshipment.dto.CarrierDto(c.carrierId,c.fname,c.mname,c.lname,c.address,c.mCNumber,c.dOTNumber,c.companyName,c.email) FROM Carrier c")
    List<CarrierDto> getAll();
     @Query("SELECT new com.pshipment.pshipment.dto.BiddingByCarrier(o.oLName,o.oLpuAddress,o.oLzipCode,o.oSrtData,o.dLName,o.dLpdAddress,o.dLzipCode, o.dDnptDate,o.noofUnitShipping,o.typeofUnit,o.weight,o.dimension,o.hazardousness,o.cargonotes,o.orderType,b.biddingId,b.expectedPrice,b.eTAToOrigion,b.eTAToDestination,b.teamSingle,b.unit,b.carrieNote,b.status) FROM Bidding b JOIN b.carrier c JOIN b.order o WHERE c.carrierId =:carrierId")
    List<BiddingByCarrier> getBidByCarrier(@Param("carrierId") int carrierId);
    @Query("SELECT new com.pshipment.pshipment.dto.AwardedCarrierOfAnOrderDto(c.carrierId,c.fname,c.mname,c.lname,c.address,c.mCNumber,c.dOTNumber,c.companyName,c.email,b.biddingId,b.expectedPrice,b.eTAToOrigion,b.eTAToDestination,b.teamSingle,b.unit,b.carrieNote,b.status) FROM Bidding b JOIN b.carrier c JOIN b.order o WHERE o.orderId =:orderId AND b.status =:award")
    AwardedCarrierOfAnOrderDto getAwardedCarrierOfAnOrder(@Param("orderId") int orderId, @Param("award") String award);
    
}