package com.pshipment.pshipment.service.Imp;

import java.util.Collection;
import java.util.List;

import javax.transaction.Transactional;

import com.pshipment.pshipment.dto.OrderDto;
import com.pshipment.pshipment.dto.OrdersDto;
import com.pshipment.pshipment.model.Order;
import com.pshipment.pshipment.repository.BiddingRepository;
import com.pshipment.pshipment.repository.CustomerRepository;
import com.pshipment.pshipment.repository.OrderRepository;
import com.pshipment.pshipment.service.Inter.OrderInter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class OrderImp implements OrderInter {
    @Autowired
    private OrderRepository orderRepo;
    @Autowired
    private CustomerRepository customerRepo;
    @Autowired
    private BiddingRepository biddingRepo;
    @Override
    public Order create(Order order, int customerId) {
        
        return customerRepo.findById(customerId).map(customer -> {
            order.setCustomer(customer);
            return orderRepo.save(order);
            // return order;
        }).orElseThrow();

    }
/*
    @Override
    public List<Order> getByCustomerId(int customerId) {
        return orderRepo.findByCustomerId(customerId);
    }
    */
    @Override
    public Order getById(int orderId) {
        return orderRepo.findById(orderId).orElse(null);
    }
    @Override
    public List<Object> getCarriersByOrderId(int orderId) {
        return orderRepo.getCarriersByOrderId(orderId);
    }
    @Override
    public Collection getCarrierByOrderId(int orderId) {
        return orderRepo.getCarrierByOrderId(orderId);
    }

    @Override
    public List<OrdersDto> getOrders() {
        return orderRepo.getOrders();
    }

    @Override
    public List<Order> getByCustomerId(int customerId, String award) {
        return orderRepo.findByCustomerId(customerId, award);
    }
    @Override
    public OrderDto findByOrderId(int orderId) {
        
        return orderRepo.findByOrderId(orderId);
    }
}