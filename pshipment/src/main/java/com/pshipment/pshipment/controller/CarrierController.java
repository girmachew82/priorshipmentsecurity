package com.pshipment.pshipment.controller;

import java.util.List;

import com.pshipment.pshipment.dto.AwardedCarrierOfAnOrderDto;
import com.pshipment.pshipment.dto.BiddingByCarrier;
import com.pshipment.pshipment.dto.CarrierDto;
import com.pshipment.pshipment.model.Carrier;
import com.pshipment.pshipment.model.Customer;
import com.pshipment.pshipment.service.Imp.CarrierImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/carrier")
public class CarrierController {
    @Autowired
    private CarrierImp carrierServiceImp;
    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Carrier> create(@RequestBody Carrier carrier) {
        return carrierServiceImp.create(carrier);
    }
    @GetMapping("/all")
    public List<Carrier> all() {
        return carrierServiceImp.all();
    }
    @GetMapping("/getAll")
    public List<CarrierDto> getAll() {
        return carrierServiceImp.getAll();
    }
    @GetMapping("/getBidByCarrierId/{carrierId}")
    public List<BiddingByCarrier> getBidByCarrierId(@PathVariable("carrierId") int carrierId) {
        return carrierServiceImp.getBidByCarrierId(carrierId);
    }
    @GetMapping("/awardedCarrier/orderId/{orderId}/award/{award}")
    public AwardedCarrierOfAnOrderDto getAwardedCarrierOfAnOder(@PathVariable("orderId") int orderId,@PathVariable("award") String award) {
        return carrierServiceImp.getAwardedCarrierOfAnOrder(orderId, award);
        
        
    }
}