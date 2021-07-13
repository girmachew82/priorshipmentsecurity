package com.pshipment.pshipment.convertor;

import java.util.List;

import com.pshipment.pshipment.dto.DriversforAnOrderDto;
import com.pshipment.pshipment.model.Driver;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

@Component
public class DriversofAnOrderConvertor {
    public DriversforAnOrderDto  entityToDto(Driver driver) {
        DriversforAnOrderDto dto = new DriversforAnOrderDto();
        dto.setDriverId(driver.getDriverId());
        dto.setFirstName(driver.getFirstName());
        dto.setMiddleName(driver.getMiddleName());
        dto.setLastName(driver.getLastName());
        dto.setPhoneNumber(driver.getPhoneNumber());
        return dto;
        }

        public List<DriversforAnOrderDto> entityToDto(List<Driver> driver) {
            return driver.stream().map(x -> entityToDto(x)).collect(Collectors.toList());
        }
        public Driver  dtoToEntity(DriversforAnOrderDto dto) {
            Driver driv = new Driver();
            driv.setDriverId(dto.getDriverId());
            driv.setFirstName(dto.getFirstName());
            driv.setMiddleName(dto.getMiddleName());
            driv.setLastName(dto.getLastName());
            driv.setPhoneNumber(dto.getPhoneNumber());
            return driv;
            
        }
    public List<Driver> dtoToEntity(List<DriversforAnOrderDto> dto) {
        return dto.stream().map(x->dtoToEntity(x)).collect(Collectors.toList());
        
    }    
}