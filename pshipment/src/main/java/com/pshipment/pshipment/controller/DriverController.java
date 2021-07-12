package com.pshipment.pshipment.controller;

import java.util.List;

import com.pshipment.pshipment.model.Driver;
import com.pshipment.pshipment.service.Imp.DriverImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;


@RestController
@RequestMapping("/driver")
public class DriverController {
    @Autowired
    DriverImp driverServiceImp;
     //Insert Driver record
    @PostMapping("carrier/{carrierId}/driver")
    @ResponseStatus(HttpStatus.CREATED)
    public Driver addDriver(@RequestBody Driver driver, @PathVariable("carrierId") int carrierId) {
     return driverServiceImp.addDriver(driver, carrierId);
     //   return driver;
}
@GetMapping("/all")
public List<Driver> getAll() {
    return driverServiceImp.getAll();
}
}