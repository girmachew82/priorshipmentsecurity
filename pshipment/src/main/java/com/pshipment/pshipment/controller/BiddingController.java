package com.pshipment.pshipment.controller;

import java.util.List;

import com.pshipment.pshipment.dto.AwardedCarrier;
import com.pshipment.pshipment.dto.CarriersOnAnOrder;
import com.pshipment.pshipment.dto.OrderBiddingCarrierDto;
import com.pshipment.pshipment.model.Bidding;
import com.pshipment.pshipment.service.Imp.BiddingImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bidding")
public class BiddingController {

    @Autowired
    private BiddingImp biddingImp;

    @PostMapping("/add/order/{orderId}/carrier/{carrierId}")
    public Bidding create(@RequestBody Bidding bidding, @PathVariable("orderId") int orderId,
            @PathVariable("carrierId") int carrierId) {
        return biddingImp.create(bidding, orderId, carrierId);
    }

    @PutMapping("/biddingId/{biddingId}/award/{award}")
    public int award(@PathVariable("biddingId") int biddingId, @PathVariable("award") String award) {
        return biddingImp.award(biddingId, award);

    }

    @GetMapping("/carriersofAnOrder/{orderId}")
    public List<CarriersOnAnOrder> getCarriersOfABid(@PathVariable(value = "orderId") int orderId) {
        return biddingImp.getCafrriersOfAnOrder(orderId);

    }
    @GetMapping("/carriersofAnOrder")
    public List<OrderBiddingCarrierDto> getCarriersOfABid() {
        return biddingImp.getCafrriersOfAnOrder();
    }
    @PutMapping("/award/{biddingId}/{status}/status")
    public int updateStatus(@PathVariable("biddingId") int biddingId, @PathVariable("status") String status) {
        return biddingImp.award(biddingId,status);
        //return biddingId+status.length();
   }
   @GetMapping("/{status}/status")
   public AwardedCarrier getAwardedCarrier(@PathVariable("status") String status) {
    return biddingImp.getAwardedCarrier( status);
  
   }
}