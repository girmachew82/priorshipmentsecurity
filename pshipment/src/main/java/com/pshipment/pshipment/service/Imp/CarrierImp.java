package com.pshipment.pshipment.service.Imp;

import com.pshipment.pshipment.model.Carrier;
import com.pshipment.pshipment.repository.CarrierRepository;
import com.pshipment.pshipment.service.Inter.CarrierInter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CarrierImp implements CarrierInter{
    @Autowired
    private CarrierRepository carrierRepo;
    @Override
    public Carrier create(Carrier carrier) {
          return carrierRepo.save(carrier);
    }
    
}