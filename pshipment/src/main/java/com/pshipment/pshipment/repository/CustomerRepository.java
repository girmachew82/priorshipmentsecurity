package com.pshipment.pshipment.repository;

import java.util.List;

import com.pshipment.pshipment.dto.CustomerOrder;
import com.pshipment.pshipment.dto.OrderBiddingCarrierDto;
import com.pshipment.pshipment.model.Customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

    @Query("SELECT new com.pshipment.pshipment.dto.CustomerOrder(c.fname , o.cargonotes) FROM Customer c JOIN c.orders o")
    List<CustomerOrder> getCustomerOrders();
    @Query("SELECT new com.pshipment.pshipment.dto.CustomerOrder(c.fname , o.cargonotes) FROM Customer c JOIN c.orders o WHERE c.customerId =:customerId")
    List<CustomerOrder> getCustomerOrders(@Param("customerId") int customerId);

}