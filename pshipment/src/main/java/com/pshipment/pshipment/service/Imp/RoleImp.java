package com.pshipment.pshipment.service.Imp;

import com.pshipment.pshipment.model.Role;
import com.pshipment.pshipment.repository.RoleRepository;
import com.pshipment.pshipment.repository.UserRepository;
import com.pshipment.pshipment.service.Inter.RoleInter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class RoleImp implements RoleInter{
    @Autowired
    private RoleRepository roleRepo;
    private UserRepository userRepo;

    @Override
    public Role add(Role role) {
        return roleRepo.save(role);
    }
}