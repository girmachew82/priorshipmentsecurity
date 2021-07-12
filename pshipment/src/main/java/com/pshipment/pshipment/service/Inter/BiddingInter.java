package com.pshipment.pshipment.service.Inter;

import java.util.List;

import com.pshipment.pshipment.dto.AwardedCarrier;
import com.pshipment.pshipment.dto.CarriersOnAnOrder;
import com.pshipment.pshipment.dto.OrderBiddingCarrierDto;
import com.pshipment.pshipment.model.Bidding;

public interface BiddingInter {
    Bidding create(Bidding bidding, int orderId, int carrierId);
    int award(int biddingId, String response);
    List<CarriersOnAnOrder> getCafrriersOfAnOrder(int orderId);
    List<OrderBiddingCarrierDto> getCafrriersOfAnOrder();
    AwardedCarrier getAwardedCarrier(String status);
}
