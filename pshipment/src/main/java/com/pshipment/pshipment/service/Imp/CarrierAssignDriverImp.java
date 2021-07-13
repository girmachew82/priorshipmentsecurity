package com.pshipment.pshipment.service.Imp;

import java.util.List;

import javax.transaction.Transactional;

import com.pshipment.pshipment.dto.DriversforAnOrderDto;
import com.pshipment.pshipment.model.Bidding;
import com.pshipment.pshipment.model.CarrierAssignDriver;
import com.pshipment.pshipment.model.Driver;
import com.pshipment.pshipment.repository.BiddingRepository;
import com.pshipment.pshipment.repository.CarrierAssignDriverRepository;
import com.pshipment.pshipment.repository.DriverRepository;
import com.pshipment.pshipment.service.Inter.CarrierAssignDriverInter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CarrierAssignDriverImp implements CarrierAssignDriverInter {
@Autowired 
private BiddingRepository biddingRepo;
@Autowired
private CarrierAssignDriverRepository carrierAssignDriverRepo;
@Autowired
private DriverRepository driverRepo;
@Override
public CarrierAssignDriver assign(CarrierAssignDriver assignDriver, int biddingId, int driverId) {
    Bidding bidding = biddingRepo.getById(biddingId);
    assignDriver.setBidding(bidding);
    Driver driver = driverRepo.findById(driverId).get();
    assignDriver.setDriver(driver);
    return carrierAssignDriverRepo.save(assignDriver);
}
@Override
public List<DriversforAnOrderDto> getDriverforAnOrder(int biddingId) {

    return carrierAssignDriverRepo.getDriverforAnOrder(biddingId);
}

    
}