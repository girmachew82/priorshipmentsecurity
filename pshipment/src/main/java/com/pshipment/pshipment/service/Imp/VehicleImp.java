package com.pshipment.pshipment.service.Imp;

import java.util.List;

import com.pshipment.pshipment.model.Carrier;
import com.pshipment.pshipment.model.Vehicle;
import com.pshipment.pshipment.repository.CarrierRepository;
import com.pshipment.pshipment.repository.VehicleRepository;
import com.pshipment.pshipment.service.Inter.VehicleInter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleImp implements VehicleInter{
    @Autowired
    private VehicleRepository vehicleRepo;
    @Autowired 
    private CarrierRepository carrierRepo;
    @Override
    public Vehicle add(Vehicle vehicle, int carrierId) {
             return carrierRepo.findById(carrierId).map(carrier -> {
            vehicle.setCarrier(carrier);
            return vehicleRepo.save(vehicle);
            // return order;
        }).orElseThrow();

    }
    @Override
    public List<Vehicle> getByCarrier(int carrierId) {
        return vehicleRepo.findByCarrier(carrierId);
    }
    
}