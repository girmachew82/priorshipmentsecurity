package com.pshipment.pshipment.service.Imp;

import java.net.URI;

import com.pshipment.pshipment.model.Customer;
import com.pshipment.pshipment.repository.CustomerRepository;
import com.pshipment.pshipment.service.Inter.CustomerInter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
@Service
public class CustomerImp implements CustomerInter {
@Autowired 
private CustomerRepository customerRepo;

    @Override
    public ResponseEntity<Customer> create(Customer customer)    
     {
         Customer savedCustomer =this.customerRepo.save(customer);
        URI location = ServletUriComponentsBuilder
                        .fromCurrentRequest()
                        .path("/{id}")
                        .buildAndExpand(savedCustomer.getCustomerId()).toUri();
         return ResponseEntity.created(location).build();
        // return customer;
     }
     
}