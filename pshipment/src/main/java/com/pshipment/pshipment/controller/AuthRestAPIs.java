package com.pshipment.pshipment.controller;

import java.util.HashSet;
import java.util.Set;

import javax.validation.Valid;


import com.pshipment.pshipment.exception.UserNotFoundException;
import com.pshipment.pshipment.message.request.LoginForm;
import com.pshipment.pshipment.message.request.SignupForm;
import com.pshipment.pshipment.message.response.JwtResponse;
import com.pshipment.pshipment.message.response.ResponseMessage;
import com.pshipment.pshipment.model.Role;
import com.pshipment.pshipment.model.RoleName;
import com.pshipment.pshipment.model.User;
import com.pshipment.pshipment.repository.RoleRepository;
import com.pshipment.pshipment.repository.UserRepository;
import com.pshipment.pshipment.security.jwt.JwtProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class AuthRestAPIs {

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    UserRepository userRepo;

    @Autowired
    RoleRepository roleRepo;

    @Autowired
    PasswordEncoder encoder;

    @Autowired
    JwtProvider jwtProvider;

    @PostMapping("/signin")
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginForm loginRequest) {

        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);

        String jwt = jwtProvider.generateJwtToken(authentication);
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();

        return ResponseEntity.ok(new JwtResponse(jwt, userDetails.getUsername(), userDetails.getAuthorities()));
    }

    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@Valid @RequestBody SignupForm signUpRequest) {
        if (userRepo.existsByUsername(signUpRequest.getUsername())) {
            return new ResponseEntity<>(new ResponseMessage("Fail -> Username is already taken!"),
                    HttpStatus.BAD_REQUEST);
        }

        if (userRepo.existsByEmail(signUpRequest.getEmail())) {
            return new ResponseEntity<>(new ResponseMessage("Fail -> Email is already in use!"),
                    HttpStatus.BAD_REQUEST);

        }

        // Creating user's account
        User user = new User(signUpRequest.getName(), signUpRequest.getUsername(), signUpRequest.getEmail(),
                encoder.encode(signUpRequest.getPassword()));

        Set<String> strRoles = signUpRequest.getRole();
        Set<Role> roles = new HashSet<>();

        strRoles.forEach(role -> {
            switch (role) {
                case "admin":
                    Role adminRole = roleRepo.findByName(RoleName.ROLE_ADMIN)
                            .orElseThrow(() -> new UserNotFoundException("Fail! -> Cause: User Role not find."));
                    roles.add(adminRole);

                    break;
                case "carrier":
                    Role carrierRole = roleRepo.findByName(RoleName.ROLE_CARRIER)
                            .orElseThrow(() -> new UserNotFoundException("Fail! -> Cause: User Role not find."));
                    roles.add(carrierRole);

                    break;
                default:
                    Role customerRole = roleRepo.findByName(RoleName.ROLE_CUSTOMER)
                            .orElseThrow(() -> new UserNotFoundException("Fail! -> Cause: User Role not find."));
                    roles.add(customerRole);
            }
        });

        user.setRoles(roles);
        userRepo.save(user);

        return new ResponseEntity<>(new ResponseMessage("User registered successfully!"), HttpStatus.OK);
    }

}
