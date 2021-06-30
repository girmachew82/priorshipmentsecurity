package com.pshipment.pshipment.controller;

import com.pshipment.pshipment.model.Bidding;
import com.pshipment.pshipment.service.Imp.BiddingImp;

import org.springframework.beans.factory.annotation.Autowired;
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
    public  Bidding create(@RequestBody Bidding bidding, @PathVariable("orderId") int orderId,@PathVariable("carrierId") int carrierId) {
     return biddingImp.create(bidding, orderId, carrierId);
    }
    @PutMapping("/update/biddingId/{biddingId}/status/{status}")
    public int award(@PathVariable("biddingId") int biddingId, @PathVariable("status") String status) {
        return biddingImp.award(biddingId, status);
        
    }

}