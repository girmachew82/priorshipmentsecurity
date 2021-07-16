package com.pshipment.pshipment.service.Inter;

import java.util.List;

import com.pshipment.pshipment.dto.DriversforAnOrderDto;
import com.pshipment.pshipment.model.CarrierAssignDriver;
import com.pshipment.pshipment.model.Driver;

public interface CarrierAssignDriverInter {
    CarrierAssignDriver assign(CarrierAssignDriver assignDriver,int  biddingId, int driverId, int vehicleId);
    List<DriversforAnOrderDto> getDriverforAnOrder(int biddingId);
}