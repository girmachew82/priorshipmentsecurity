package com.pshipment.pshipment.service.Inter;

import java.util.List;

import com.pshipment.pshipment.model.Driver;

public interface DriverInter {
    Driver addDriver(Driver driver, int carrierId);
    //Driver assignDriver(int driverId, int biddingId);
    List<Driver> getAll();
}