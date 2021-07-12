package com.pshipment.pshipment.service.Imp;

import javax.transaction.Transactional;

import com.pshipment.pshipment.model.Bidding;
import com.pshipment.pshipment.model.CarrierAssignDriver;
import com.pshipment.pshipment.repository.BiddingRepository;
import com.pshipment.pshipment.repository.CarrierAssignDriverRepository;
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
@Override
public CarrierAssignDriver assign(CarrierAssignDriver assignDriver, int biddingId) {
    Bidding bidding = biddingRepo.getById(biddingId);
    assignDriver.setBidding(bidding);
    return carrierAssignDriverRepo.save(assignDriver);
}

    
}