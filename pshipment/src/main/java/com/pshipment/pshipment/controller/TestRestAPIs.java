package com.pshipment.pshipment.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class TestRestAPIs {

    @GetMapping("/api/test/customer")
    @PreAuthorize("hasRole('CUSTOMER') or hasRole('ADMIN')")
    public String customerAccess() {
        return ">>> Customer Contents!";
    }

    @GetMapping("/api/test/carrier")
    @PreAuthorize("hasRole('CARRIER') or hasRole('ADMIN')")
    public String carrierAccess() {
        return ">>> Carrier Content";
    }

    @GetMapping("/api/test/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String adminAccess() {
        return ">>> Admin Contents";
    }
}

