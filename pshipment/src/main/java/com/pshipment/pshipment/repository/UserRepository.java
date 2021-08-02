package com.pshipment.pshipment.repository;

import com.pshipment.pshipment.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
    User findByusername(String userName);
}