package com.pshipment.pshipment.controller;

import java.util.List;

import com.pshipment.pshipment.dto.DriversforAnOrder;
import com.pshipment.pshipment.model.CarrierAssignDriver;
import com.pshipment.pshipment.service.Imp.CarrierAssignDriverImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
    @PostMapping("/biddingId/{biddingId}/driverId/{driverId}")
    public CarrierAssignDriver  carrierAssignDriver(@RequestBody CarrierAssignDriver carrierAssignDriver, @PathVariable("biddingId") int biddingId, @PathVariable("driverId") int driverId  ){
        return assignDriverImp.assign(carrierAssignDriver, biddingId, driverId);
    }
    @GetMapping("/getDrivers/{biddingId}")
    public List<Object> getDriversforAnOrder(@PathVariable("biddingId") int biddingId){
    return assignDriverImp.getDriverforAnOrder(biddingId);
    }
}