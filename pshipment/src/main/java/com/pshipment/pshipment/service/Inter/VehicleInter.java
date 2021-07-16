package com.pshipment.pshipment.service.Inter;

import java.util.List;

import com.pshipment.pshipment.model.Vehicle;

public interface VehicleInter {
    Vehicle add(Vehicle vehicle, int carrierId);
    List<Vehicle> getByCarrier(int carrierId);
}