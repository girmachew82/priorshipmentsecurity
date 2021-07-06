package com.pshipment.pshipment.service.Inter;

import java.util.List;

import com.pshipment.pshipment.dto.BiddingByCarrier;
import com.pshipment.pshipment.dto.CarrierDto;
import com.pshipment.pshipment.model.Carrier;

public interface CarrierInter {
    Carrier create(Carrier carrier);
    List<Carrier> all();
    List<CarrierDto> getAll();
    List<BiddingByCarrier> getBidByCarrierId(int carrierId);
}