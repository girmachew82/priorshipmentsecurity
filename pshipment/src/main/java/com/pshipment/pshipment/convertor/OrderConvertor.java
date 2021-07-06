package com.pshipment.pshipment.convertor;

import java.util.List;

import com.pshipment.pshipment.dto.OrderDto;
import com.pshipment.pshipment.model.Order;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

@Component
public class OrderConvertor {
    
    public OrderDto  entityToDto(Order order) {
        
        OrderDto dto = new OrderDto();
        dto.setOrderId(order.getOrderId());
        dto.setoLName(order.getoLName());
        dto.setoLpuAddress(order.getoLpuAddress());
        dto.setoLzipCode(order.getoLzipCode());
        return dto;
         
        }

        public List<OrderDto> entityToDto(List<Order> Order) {
            return Order.stream().map(x -> entityToDto(x)).collect(Collectors.toList());
        }
        public Order  dtoToEntity(OrderDto dto) {
            Order ordr = new Order();
            ordr.setOrderId(dto.getOrderId());
            ordr.setoLName(dto.getoLName());
            ordr.setoLpuAddress(dto.getoLpuAddress());
            ordr.setoLzipCode(dto.getoLzipCode());
           return ordr;
            
        }
    public List<Order> dtoToEntity(List<OrderDto> dto) {
        return dto.stream().map(x->dtoToEntity(x)).collect(Collectors.toList());
        
    }       
}