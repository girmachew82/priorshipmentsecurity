package com.pshipment.pshipment.service.Imp;

import java.util.List;

import com.pshipment.pshipment.dto.AwardedCarrierOfAnOrderDto;
import com.pshipment.pshipment.dto.BiddingByCarrier;
import com.pshipment.pshipment.dto.CarrierDto;
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
    @Override
    public List<Carrier> all() {
        return carrierRepo.findAll();
    }
    @Override
    public List<CarrierDto> getAll() {

        return carrierRepo.getAll();
    }
    @Override
    public List<BiddingByCarrier> getBidByCarrierId(int carrierId) {
        return carrierRepo.getBidByCarrier(carrierId);
    }
    @Override
    public AwardedCarrierOfAnOrderDto getAwardedCarrierOfAnOrder(int orderId, String award) {
        return carrierRepo.getAwardedCarrierOfAnOrder(orderId, award);
    }
    
}