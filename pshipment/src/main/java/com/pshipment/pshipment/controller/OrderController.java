package com.pshipment.pshipment.controller;

import java.util.List;

import com.pshipment.pshipment.dto.OrdersDto;
import com.pshipment.pshipment.model.Order;
import com.pshipment.pshipment.service.Imp.CustomerImp;
import com.pshipment.pshipment.service.Imp.OrderImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/order")
public class OrderController {
    
    @Autowired
    private OrderImp orderServiceImp;

    @Autowired
    private CustomerImp customerServiceImp;

    @GetMapping("/all")
    public List<OrdersDto>  getOrders() {
        return orderServiceImp.getOrders();
    }
    // Insert order record
    @PostMapping("/add/customer/{customerId}")
    @ResponseStatus(HttpStatus.CREATED)
    public Order create(@RequestBody Order order, @PathVariable("customerId") int customerId) {
        return orderServiceImp.create(order, customerId);
        // return order;
    }
    @GetMapping("/getByCustomerId/{customerId}")
    public List<Order> getByCustomerId(@PathVariable("customerId") int customerId) {
        return orderServiceImp.getByCustomerId(customerId);
    }
    @GetMapping("/getById/{orderId}")
    public Order getById(@PathVariable("orderId") int orderId) {
        return orderServiceImp.getById(orderId);
    }
    @GetMapping("/getCarriersByOrderId/{orderId}")
    public List<Object>  getCarriersByOrderId(@PathVariable("orderId") int orderId) {
        return orderServiceImp.getCarriersByOrderId(orderId);
    }
}