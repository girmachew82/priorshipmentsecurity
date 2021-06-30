package com.pshipment.pshipment.service.Inter;

import com.pshipment.pshipment.model.Order;

public interface OrderInter {
  Order create(Order order, int customerId);

}