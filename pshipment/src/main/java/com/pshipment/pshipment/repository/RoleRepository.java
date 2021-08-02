package com.pshipment.pshipment.repository;

<<<<<<< HEAD
import com.pshipment.pshipment.model.Role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{
    Role findByroleName(String roleName);
}
=======


import com.pshipment.pshipment.model.Role;
import com.pshipment.pshipment.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository <Role, Integer>
{
    Optional<Role> findByName(RoleName roleName);
}
>>>>>>> 2f265f85bd23b7a4514af85f4dac4ff14d4c9d06
