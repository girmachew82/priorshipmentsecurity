package com.pshipment.pshipment.repository;

import java.util.List;

import com.pshipment.pshipment.dto.AwardedCarrier;
import com.pshipment.pshipment.dto.CarriersOnAnOrder;
import com.pshipment.pshipment.dto.OrderBiddingCarrierDto;
import com.pshipment.pshipment.model.Bidding;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BiddingRepository extends JpaRepository<Bidding, Integer> {
    @Modifying(clearAutomatically = true)
    @Query("UPDATE Bidding b SET b.status = :status WHERE b.biddingId = :biddingId")
    public int updatestatusRepo(@Param("biddingId") int biddingId, @Param("status") String status);

    @Query("SELECT new com.pshipment.pshipment.dto.CarriersOnAnOrder(c.carrierId,c.fname,c.mname,c.lname,c.address,c.mCNumber,c.dOTNumber,c.companyName,c.email,b.biddingId,b.expectedPrice,b.eTAToOrigion,b.eTAToDestination,b.teamSingle,b.unit,b.carrieNote,b.status) FROM Bidding b JOIN b.carrier c JOIN b.order o WHERE o.orderId =:orderId")
    List<CarriersOnAnOrder> getCarriersOfAnOrder(@Param("orderId") int orderId);
    @Query("SELECT new com.pshipment.pshipment.dto.OrderBiddingCarrierDto(b.biddingId,o.orderId,c.carrierId,b.expectedPrice) FROM Bidding b JOIN b.carrier c JOIN b.order o ")
    List<OrderBiddingCarrierDto> getCarriersOfAnOrder();
    
   // @Modifying(clearAutomatically = true)
   // @Query("UPDATE Bidding b SET b.status = :status WHERE b.biddingId = :biddingId")

    @Query("SELECT new com.pshipment.pshipment.dto.AwardedCarrier(c.carrierId,c.fname,c.mname,c.lname,c.address,c.mCNumber,c.dOTNumber,c.companyName,c.email) FROM Bidding b JOIN b.carrier c JOIN b.order o WHERE  b.status=:status ")
     AwardedCarrier getAwardedCarrier(@Param("status") String status);

    // Get Bidding by status
    @Query(value = "SELECT b FROM Bidding b WHERE biddingId =:biddingId")
    Bidding getById(@Param("biddingId") int biddingId);
}