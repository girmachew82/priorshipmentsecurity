package com.pshipment.pshipment.service.Imp;

import javax.transaction.Transactional;

import com.pshipment.pshipment.model.Role;
import com.pshipment.pshipment.model.User;
import com.pshipment.pshipment.repository.RoleRepository;
import com.pshipment.pshipment.repository.UserRepository;
import com.pshipment.pshipment.service.Inter.UserInter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserImp implements UserInter{
    private RoleRepository roleRepo;
    @Autowired
    private UserRepository userRepo;
    public User add(User user) {
        return userRepo.save(user);
    }
    @Override
    public void addRoleToUser(int userId, int roleId) {
        
    }

}