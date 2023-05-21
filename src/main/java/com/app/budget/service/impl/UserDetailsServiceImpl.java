package com.app.budget.service.impl;

import com.app.budget.data.UserDetails;
import com.app.budget.repository.UserDetailsRepository;
import com.app.budget.service.UserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailService {

    @Autowired
    private UserDetailsRepository userDetailsRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void addUser(UserDetails userDetails) {
        try {
            userDetails.setPassword(passwordEncoder.encode(userDetails.getPassword()));
            userDetailsRepository.save(userDetails);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
