package com.pshipment.pshipment.controller;

import java.util.List;

import com.pshipment.pshipment.dto.CustomerDto;
import com.pshipment.pshipment.model.Customer;
import com.pshipment.pshipment.service.Imp.CustomerImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired 
     private CustomerImp customerServiceImp;

//Insert cusomer record
@PostMapping("/add")
@ResponseStatus(HttpStatus.CREATED)
public ResponseEntity<Customer> create(@RequestBody Customer customer)
{
    return customerServiceImp.create(customer);
}
@GetMapping("/all")
public List<CustomerDto> All() {
    return customerServiceImp.all();
    
}
@GetMapping("/find/{customerId}")
public CustomerDto getById(@PathVariable(value = "customerId") int customerId) {
    return customerServiceImp.getById(customerId);
    
}
}