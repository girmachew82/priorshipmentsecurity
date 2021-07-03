package com.pshipment.pshipment.convertor;

import com.pshipment.pshipment.dto.CustomerDto;
import com.pshipment.pshipment.model.Customer;

public class OrderBiddingCarrierConvertor {
    public CustomerDto  entityToDto(Customer customer) {
        CustomerDto dto = new CustomerDto();
        dto.setCustomerId(customer.getCustomerId());
        dto.setFname(customer.getFname());
        dto.setMname(customer.getMname());
        dto.setLname(customer.getLname());
        dto.setAddress(customer.getAddress());
        dto.setCompany(customer.getCompany());
        dto.setEmail(customer.getEmail());
        dto.setPhoneNumber(customer.getPhoneNumber());
        return dto;
        }
} 