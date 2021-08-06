package com.pshipment.pshipment.repository;



import com.pshipment.pshipment.model.Role;
import com.pshipment.pshipment.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository <Role, Integer>
{
    Optional<Role> findByName(RoleName roleName);
}
