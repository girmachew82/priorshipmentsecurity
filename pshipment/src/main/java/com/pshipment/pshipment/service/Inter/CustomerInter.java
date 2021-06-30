package com.pshipment.pshipment.service.Inter;

import java.util.List;
import java.util.Set;

import com.pshipment.pshipment.dto.CustomerDto;
import com.pshipment.pshipment.model.Customer;

import org.springframework.http.ResponseEntity;

public interface CustomerInter {
   ResponseEntity<Customer> create(Customer customer);
   List<CustomerDto> all();
   
}