package com.pshipment.pshipment.controller;

import com.pshipment.pshipment.model.CarrierAssignDriver;
import com.pshipment.pshipment.service.Imp.CarrierAssignDriverImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/assignDriver")
public class AssignDriverController {
    @Autowired
    private CarrierAssignDriverImp assignDriverImp;
    @PostMapping("/{biddingId}")
    public CarrierAssignDriver  carrierAssignDriver(@RequestBody CarrierAssignDriver carrierAssignDriver, @PathVariable("biddingId") int biddingId ){
        return assignDriverImp.assign(carrierAssignDriver, biddingId);
    }
}