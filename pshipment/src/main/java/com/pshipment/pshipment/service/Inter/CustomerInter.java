package com.pshipment.pshipment.service.Inter;

import java.util.List;
import java.util.Set;

import com.pshipment.pshipment.dto.CustomerDto;
import com.pshipment.pshipment.dto.CustomerOrder;
import com.pshipment.pshipment.model.Customer;

import org.springframework.http.ResponseEntity;

public interface CustomerInter {
   ResponseEntity<Customer> create(Customer customer);
   List<CustomerDto> all();
   CustomerDto getById(int customerId);
   List<CustomerOrder> getCustomerOrder();
   List<CustomerOrder> getCustomerOrder(int customerId);

}