package com.pshipment.pshipment.controller;

import java.util.List;

import javax.faces.annotation.RequestMap;

import com.pshipment.pshipment.model.Vehicle;
import com.pshipment.pshipment.service.Imp.VehicleImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {

    @Autowired
    private VehicleImp vehicleServiceImp;

    @PostMapping("/add/carrierId/{carrierId}")
    public Vehicle add(@RequestBody Vehicle vehicle, @PathVariable("carrierId") int carrierId) {
        return vehicleServiceImp.add(vehicle, carrierId);
        
    }
    @GetMapping("/getVehicel/carrierId/{carrierId}")
    public List<Vehicle> getVehicelByCarrier(@PathVariable("carrierId") int carrierId) {
        return vehicleServiceImp.getByCarrier(carrierId);
        
    }
}