package com.pshipment.pshipment.service.Inter;

import java.util.List;

import com.pshipment.pshipment.dto.DriversforAnOrder;
import com.pshipment.pshipment.model.CarrierAssignDriver;

public interface CarrierAssignDriverInter {
    CarrierAssignDriver assign(CarrierAssignDriver assignDriver,int  biddingId, int driverId);
    List<Object> getDriverforAnOrder(int biddingId);
}