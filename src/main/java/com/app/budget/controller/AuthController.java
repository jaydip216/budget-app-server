package com.app.budget.controller;

import com.app.budget.data.UserDetails;
import com.app.budget.service.UserDetailService;
import com.app.budget.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.budget.constants.ApplicationConstants;
import com.app.budget.domain.AuthRequest;

@RestController
@RequestMapping(value = ApplicationConstants.V1_VERSON + "auth")
public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private UserDetailService userDetailService;

    @PostMapping(value = "/login")
    public ResponseEntity<String> authenticateUser(@RequestBody AuthRequest authRequest) {
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getUserId(), authRequest.getPassword()));
        if(authentication.isAuthenticated()) {
            return ResponseEntity.ok(jwtUtil.generateToken(authRequest.getUserId()));
        }else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid userId or password");
        }
    }

    @PostMapping(value = "/register")
    public ResponseEntity<String> registerUser(@RequestBody UserDetails userDetails) {
        userDetailService.addUser(userDetails);
        return ResponseEntity.status(HttpStatus.CREATED).body("User created successfully");
    }

}
