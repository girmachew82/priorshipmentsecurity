package com.pshipment.pshipment.controller;

import com.pshipment.pshipment.model.Carrier;
import com.pshipment.pshipment.service.Imp.CarrierImp;

import org.springframework.beans.factory.annotation.Autowired;
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
}