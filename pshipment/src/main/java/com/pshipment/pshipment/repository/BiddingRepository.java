package com.pshipment.pshipment.repository;

import java.util.List;

import com.pshipment.pshipment.dto.AwardedCarrierDto;
import com.pshipment.pshipment.dto.AwardedOrderDto;
import com.pshipment.pshipment.dto.BiddingDto;
import com.pshipment.pshipment.dto.CarriersOnAnOrder;
import com.pshipment.pshipment.dto.OrderBiddingCarrierDto;
import com.pshipment.pshipment.model.Bidding;

import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BiddingRepository extends JpaRepository<Bidding, Integer> {
    @Modifying(clearAutomatically = true)
    @Query("UPDATE Bidding b SET b.status = :award WHERE b.biddingId = :biddingId")
    public int updatestatusRepo(@Param("biddingId") int biddingId, @Param("award") String award);

    @Query("SELECT new com.pshipment.pshipment.dto.CarriersOnAnOrder(c.carrierId,c.fname,c.mname,c.lname,c.address,c.mCNumber,c.dOTNumber,c.companyName,c.email,b.biddingId,b.expectedPrice,b.eTAToOrigion,b.eTAToDestination,b.teamSingle,b.unit,b.carrieNote,b.status) FROM Bidding b JOIN b.carrier c JOIN b.order o WHERE o.orderId =:orderId")
    List<CarriersOnAnOrder> getCarriersOfAnOrder(@Param("orderId") int orderId);
    @Query("SELECT new com.pshipment.pshipment.dto.OrderBiddingCarrierDto(b.biddingId,o.orderId,c.carrierId,b.expectedPrice) FROM Bidding b JOIN b.carrier c JOIN b.order o ")
    List<OrderBiddingCarrierDto> getCarriersOfAnOrder();
    
   // @Modifying(clearAutomatically = true)
   // @Query("UPDATE Bidding b SET b.status = :status WHERE b.biddingId = :biddingId")

    @Query("SELECT new com.pshipment.pshipment.dto.AwardedCarrierDto(c.carrierId,c.fname,c.mname,c.lname,c.address,c.mCNumber,c.dOTNumber,c.companyName,c.email) FROM Bidding b JOIN b.carrier c JOIN b.order o WHERE  b.status=:status ")
     AwardedCarrierDto getAwardedCarrier(@Param("status") String status);

    // Get Bidding by status
    @Query(value = "SELECT b FROM Bidding b WHERE biddingId =:biddingId")
    Bidding getById(@Param("biddingId") int biddingId);

   // @Query("SELECT new com.pshipment.pshipment.dto.AwardedOrderDto(o.orderId,o.oLName,o.oLpuAddress,o.oLzipCode,c.carrierId,c.fname,c.mname,c.lname,c.address,c.mCNumber,c.dOTNumber,c.companyName,c.email,b.biddingId,b.expectedPrice,b.eTAToOrigion,b.eTAToDestination,b.teamSingle,b.unit,b.carrieNote,b.status,d) FROM Bidding b JOIN b.carrier c  JOIN b.drivers d  JOIN b.order o  WHERE o.orderId =:orderId AND b.status =:award")
    //List<AwardedOrderDto> getCarrierOfAnAwardedOrder(@Param("orderId") int orderId, @Param("award") String award);
    @Query(name = "findAwardedOrder", nativeQuery = true)
    List<AwardedOrderDto> getAwardedOrder(@Param("biddingId")  Integer biddingId);

    @Query("SELECT new com.pshipment.pshipment.dto.BiddingDto(b.biddingId,b.expectedPrice,b.eTAToOrigion,b.eTAToDestination,b.teamSingle,b.unit,b.carrieNote,b.status) FROM Bidding b JOIN b.order o  WHERE o.orderId =:orderId AND b.status =:award")
    BiddingDto getByOrderIdAndAward(@Param("orderId") int orderId, @Param("award") String award);
}