package com.pshipment.pshipment.controller;

import java.util.List;

import com.pshipment.pshipment.dto.BiddingByCarrier;
import com.pshipment.pshipment.dto.CarrierDto;
import com.pshipment.pshipment.model.Carrier;
import com.pshipment.pshipment.service.Imp.CarrierImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carrier")
public class CarrierController {
    @Autowired
    private CarrierImp carrierServiceImp;
    @PostMapping("/add")
    public Carrier create(@RequestBody Carrier carrier) {
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
}