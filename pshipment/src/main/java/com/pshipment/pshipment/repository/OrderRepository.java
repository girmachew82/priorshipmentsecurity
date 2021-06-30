package com.pshipment.pshipment.repository;

import java.util.List;
import java.util.Optional;

import com.pshipment.pshipment.model.Order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>{
    @Query(value = "SELECT o FROM Order o where customer_id=:customerId")
    List<Order> findByCustomerId(int customerId);
}