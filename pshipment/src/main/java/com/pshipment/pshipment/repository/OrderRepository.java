package com.pshipment.pshipment.repository;

import com.pshipment.pshipment.model.Order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>{
    
}