package com.pshipment.pshipment.repository;

import com.pshipment.pshipment.model.Role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{
    Role findByroleName(String roleName);
}