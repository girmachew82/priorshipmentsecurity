package com.pshipment.pshipment.service.Inter;

import java.util.List;

import com.pshipment.pshipment.dto.AwardedCarrierDto;
import com.pshipment.pshipment.dto.AwardedOrderDto;
import com.pshipment.pshipment.dto.BiddingDto;
import com.pshipment.pshipment.dto.CarriersOnAnOrder;
import com.pshipment.pshipment.dto.OrderBiddingCarrierDto;
import com.pshipment.pshipment.model.Bidding;

public interface BiddingInter {
    Bidding create(Bidding bidding, int orderId, int carrierId);
    int award(int biddingId, String award);
    List<CarriersOnAnOrder> getCafrriersOfAnOrder(int orderId);
    List<OrderBiddingCarrierDto> getCafrriersOfAnOrder();
    AwardedCarrierDto getAwardedCarrier(String status);
   // List<AwardedOrderDto> getAwardedOrder(int orderId, String award);
    List<AwardedOrderDto> getAwardedOrder2(int biddingId);
    BiddingDto getByOrderIdAndAward(int orderId,String award);


}
