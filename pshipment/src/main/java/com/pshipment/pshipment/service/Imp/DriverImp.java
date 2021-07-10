package com.pshipment.pshipment.service.Imp;

import java.util.List;

import com.pshipment.pshipment.model.Driver;
import com.pshipment.pshipment.repository.BiddingRepository;
import com.pshipment.pshipment.repository.CarrierRepository;
import com.pshipment.pshipment.repository.DriverRepository;
import com.pshipment.pshipment.service.Inter.DriverInter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverImp implements DriverInter {
    @Autowired
    DriverRepository driverRepo;
    @Autowired
    CarrierRepository carrierRepo;
    @Autowired
    BiddingRepository biddingRepo;
 
    @Override
    public Driver addDriver(Driver driver, int carrierId) {
                        return carrierRepo.findById(carrierId).map(carrier ->{
                            driver.setCarrier(carrier);
                return driverRepo.save(driver);
                //return order;
                }).orElseThrow();
                
    }

    @Override
    public List<Driver> getAll() {
        return driverRepo.findAll();

    }
    
}