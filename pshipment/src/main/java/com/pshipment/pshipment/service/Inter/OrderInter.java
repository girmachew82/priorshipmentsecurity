package com.pshipment.pshipment.service.Inter;

import java.util.List;

import com.pshipment.pshipment.dto.OrderDto;
import com.pshipment.pshipment.dto.OrdersDto;
import com.pshipment.pshipment.model.Order;

public interface OrderInter {
  Order create(Order order, int customerId);
 // List<Order> getByCustomerId(int customerId);
  List<Order> getByCustomerId(int customerId, String award);
  List<Object> getCarriersByOrderId(int orderId);
  Object getCarrierByOrderId(int orderId);
  Order getById(int orderId);
  OrderDto findByOrderId(int orderId);
  List<OrdersDto> getOrders();
}