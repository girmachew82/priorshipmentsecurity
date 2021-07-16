package com.pshipment.pshipment.controller;

import java.util.List;

import com.pshipment.pshipment.dto.AwardedCarrierDto;
import com.pshipment.pshipment.dto.AwardedCarrierOfAnOrderDto;
import com.pshipment.pshipment.dto.AwardedOrderDto;
import com.pshipment.pshipment.dto.BiddingDto;
import com.pshipment.pshipment.dto.CarriersOnAnOrder;
import com.pshipment.pshipment.dto.DriverDto;
import com.pshipment.pshipment.dto.DriversforAnOrderDto;
import com.pshipment.pshipment.dto.OrderDto;
import com.pshipment.pshipment.dto.OrdersDto;
import com.pshipment.pshipment.model.Bidding;
import com.pshipment.pshipment.model.Carrier;
import com.pshipment.pshipment.model.Driver;
import com.pshipment.pshipment.model.Order;
import com.pshipment.pshipment.service.Imp.BiddingImp;
import com.pshipment.pshipment.service.Imp.CarrierAssignDriverImp;
import com.pshipment.pshipment.service.Imp.CarrierImp;
import com.pshipment.pshipment.service.Imp.CustomerImp;
import com.pshipment.pshipment.service.Imp.DriverImp;
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
    @Autowired
    private DriverImp driverServiceImp;
    @Autowired
    private CarrierAssignDriverImp assignImp;
    @Autowired
    private BiddingImp biddingServiceImp;
    @Autowired
    private CarrierImp carrierServiceImp;
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
    /*
    @GetMapping("/getByCustomerId/{customerId}")
    public List<Order> getByCustomerId(@PathVariable("customerId") int customerId) {
        return orderServiceImp.getByCustomerId(customerId);
    }
    */
    @GetMapping("/getByCustomerId/{customerId}/award/{award}")
    public List<Order> getByCustomerId(@PathVariable("customerId") int customerId, @PathVariable("award") String award) {
        return orderServiceImp.getByCustomerId(customerId, award);
    }
    @GetMapping("/getById/{orderId}")
    public Order getById(@PathVariable("orderId") int orderId) {
        return orderServiceImp.getById(orderId);
    }
    @GetMapping("/getCarriersByOrderId/{orderId}")
    public List<Object>  getCarriersByOrderId(@PathVariable("orderId") int orderId) {
        return orderServiceImp.getCarriersByOrderId(orderId);
    }
    @GetMapping("/orderDetail/{orderId}/award/{award}")
    public AwardedOrderDto orderDetail(@PathVariable("orderId") int orderId, @PathVariable("award") String award) {
        AwardedOrderDto awardedOrderDto = new AwardedOrderDto();

        OrderDto orderDto = orderServiceImp.findByOrderId(orderId);
      // AwardedCarrierOfAnOrderDto awardedCarrier  = carrierServiceImp.getAwardedCarrierOfAnOrder(orderId,award);
       // AwardedCarrierOfAnOrderDto carrier = carrierServiceImp.getAwardedCarrierOfAnOrder(orderId,award);
       // List<Driver> driver = driverServiceImp.getDriverByCarrierId();
        
       awardedOrderDto.setOrder(orderDto);
      // BiddingDto  bidding = biddingServiceImp.getByOrderIdAndAward(orderId, award);
       //awardedOrderDto.setBiddingId(bidding.getBiddingId());
       //awardedOrderDto.setExpectedPrice(bidding.getExpectedPrice());
       AwardedCarrierOfAnOrderDto  awardedCarrier = carrierServiceImp.getAwardedCarrierOfAnOrder(orderId, award);
       awardedOrderDto.setCarrierOnAnOrder(awardedCarrier);
        List<DriversforAnOrderDto> drivers = assignImp.getDriverforAnOrder(orderId);
        awardedOrderDto.setDriversDto(drivers);
        
       //int biddingId = awardedCarrier.getBiddingId();
 
      //   awardedOrderDto.setCarrierId(awardedCarrier.getCarrierId());
       // awardedOrderDto.setCarrierId(carrier);
       // awardedOrderDto.setDriversDto(drivers);

        return awardedOrderDto;
        
    }
}