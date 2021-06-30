package com.pshipment.pshipment.service.Inter;

import com.pshipment.pshipment.model.Customer;

import org.springframework.http.ResponseEntity;

public interface CustomerInter {
   ResponseEntity<Customer> create(Customer customer);
   /*
    Page<Customer> getAll(Pageable pageable);
    List<Object> customers();
   // Customer customerUpdate(int customerId);
    Customer update(Customer customer, int customerId);
    Customer getById(int customerId);
    void delete(int customerId);
  */
   
}