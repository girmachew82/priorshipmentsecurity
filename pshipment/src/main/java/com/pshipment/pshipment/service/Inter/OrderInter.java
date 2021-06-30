package com.pshipment.pshipment.service.Inter;

import java.util.List;

import com.pshipment.pshipment.model.Order;

public interface OrderInter {
  Order create(Order order, int customerId);
  List<Order> getById(int customerId);
}