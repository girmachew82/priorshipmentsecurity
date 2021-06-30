package com.pshipment.pshipment.service.Imp;

import java.util.List;

import com.pshipment.pshipment.model.Order;
import com.pshipment.pshipment.repository.CustomerRepository;
import com.pshipment.pshipment.repository.OrderRepository;
import com.pshipment.pshipment.service.Inter.OrderInter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class OrderImp implements OrderInter {
    @Autowired
    private OrderRepository orderRepo;
    @Autowired
    private CustomerRepository customerRepo;
  
    @Override
    public Order create(Order order, int customerId) {
        
        return customerRepo.findById(customerId).map(customer -> {
            order.setCustomer(customer);
            return orderRepo.save(order);
            // return order;
        }).orElseThrow();

    }

    @Override
    public List<Order> getById(int customerId) {
        return orderRepo.findByCustomerId(customerId);
    }
    
}