package com.pshipment.pshipment.repository;

import java.util.List;
import java.util.Optional;

import com.pshipment.pshipment.dto.OrderDto;
import com.pshipment.pshipment.dto.OrdersDto;
import com.pshipment.pshipment.model.Order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>{
   // @Query(value = "SELECT o FROM Order o where customer_id=:customerId")
    //List<Order> findByCustomerId(@Param("customerId")int customerId);

    @Query(value = "SELECT o,b FROM Order o, Bidding b where customer_id=:customerId AND b.status =:award")
    List<Order> findByCustomerId(@Param("customerId")int customerId, @Param("award") String award);

/*
    @Query(value = "SELECT
                        c,
                        b,
                        o
                    FROM
                        Carrier,
                        Bidding,
                        Order
                    INNER JOIN carriers ON carriers.carrier_id = biddings.carrier_id
                    INNER JOIN orders ON orders.order_id = biddings.order_id
                    WHERE

                        biddings.order_id = 1");
 */
    @Query(value = "SELECT  `carriers`.`carrier_id`,`carriers`.`fname`,`carriers`.`mname`,`carriers`.`lname`,`carriers`.`address`,`carriers`.`email`,`carriers`.`company_name`,`biddings`.`bidding_id`,`biddings`.`carrie_note`,`biddings`.`etato_destination`,`biddings`.`etato_origion`,`biddings`.`expected_price`,`biddings`.`status`,`biddings`.`team_single`,`biddings`.`unit` FROM `biddings`  INNER JOIN `carriers` ON `carriers`.`carrier_id` = `biddings`.`carrier_id` INNER JOIN `orders` ON `orders`.`order_id` = `biddings`.`order_id`   WHERE `orders`.`order_id`=:orderId", nativeQuery=true)
    public List<Object> getCarriersByOrderId(@Param("orderId") int orderId);
    @Query(value = "SELECT  `carriers`.`carrier_id`,`carriers`.`fname`,`carriers`.`mname`,`carriers`.`lname`,`carriers`.`address`,`carriers`.`email`,`carriers`.`company_name`,`biddings`.`bidding_id`,`biddings`.`carrie_note`,`biddings`.`etato_destination`,`biddings`.`etato_origion`,`biddings`.`expected_price`,`biddings`.`status`,`biddings`.`team_single`,`biddings`.`unit` FROM `biddings`  INNER JOIN `carriers` ON `carriers`.`carrier_id` = `biddings`.`carrier_id` INNER JOIN `orders` ON `orders`.`order_id` = `biddings`.`order_id`   WHERE `orders`.`order_id`=:orderId", nativeQuery=true)
    public Object getCarrierByOrderId(@Param("orderId") int orderId);
    
    @Query("SELECT new com.pshipment.pshipment.dto.OrdersDto(o.orderId,o.oLName,o.oLpuAddress,o.oLzipCode, o.oSrtData,o.dLName,o.dLpdAddress,o.dLzipCode,o.dDnptDate,o.noofUnitShipping,o.typeofUnit,o.weight,o.dimension,o.hazardousness,o.cargonotes,o.orderType,o.status) FROM Order o")
    public List<OrdersDto>  getOrders();

    @Query("SELECT new com.pshipment.pshipment.dto.OrderDto(o.orderId,o.oLName,o.oLpuAddress,o.oLzipCode, o.oSrtData,o.dLName,o.dLpdAddress,o.dLzipCode,o.dDnptDate,o.noofUnitShipping,o.typeofUnit,o.weight,o.dimension,o.hazardousness,o.cargonotes,o.orderType,o.status) FROM Order o WHERE orderId=:orderId")
    public OrderDto findByOrderId(@Param("orderId") int orderId);
}