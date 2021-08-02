package com.pshipment.pshipment.repository;

<<<<<<< HEAD
import com.pshipment.pshipment.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
    User findByusername(String userName);
=======

import com.pshipment.pshipment.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
>>>>>>> 2f265f85bd23b7a4514af85f4dac4ff14d4c9d06
}