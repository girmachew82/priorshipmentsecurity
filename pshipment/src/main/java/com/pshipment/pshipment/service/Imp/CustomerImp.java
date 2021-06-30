package com.pshipment.pshipment.service.Imp;

import java.net.URI;
import java.util.List;
import java.util.Set;

import com.pshipment.pshipment.convertor.CustomerConvertor;
import com.pshipment.pshipment.dto.CustomerDto;
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
@Autowired
private CustomerConvertor convertor;
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

     @Override
     public List<CustomerDto> all() {
         List<Customer> library =  customerRepo.findAll();
         return convertor.entityToDto(library);
     }
}