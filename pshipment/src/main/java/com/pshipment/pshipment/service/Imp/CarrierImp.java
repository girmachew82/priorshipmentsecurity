package com.pshipment.pshipment.service.Imp;

import java.net.URI;
import java.util.List;

import com.pshipment.pshipment.dto.AwardedCarrierOfAnOrderDto;
import com.pshipment.pshipment.dto.BiddingByCarrier;
import com.pshipment.pshipment.dto.CarrierDto;
import com.pshipment.pshipment.model.Carrier;
import com.pshipment.pshipment.repository.CarrierRepository;
import com.pshipment.pshipment.service.Inter.CarrierInter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@Service
public class CarrierImp implements CarrierInter{
    @Autowired
    private CarrierRepository carrierRepo;
    @Override
    public ResponseEntity<Carrier> create(Carrier carrier)
    {
        Carrier savedCarrier=this.carrierRepo.save(carrier);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedCarrier.getCarrierId()).toUri();
        return ResponseEntity.created(location).build();

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