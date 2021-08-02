package com.pshipment.pshipment.controller;

import javax.faces.annotation.RequestMap;

import com.pshipment.pshipment.model.Role;
import com.pshipment.pshipment.service.Imp.RoleImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/role")
public class RoleController {
    @Autowired 
    private RoleImp roleServiceImp;
    @PostMapping("/add")
    public Role add(@RequestBody Role role)
    {
        return roleServiceImp.add(role);
    }
}