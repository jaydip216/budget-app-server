package com.app.budget.service.impl;

import com.app.budget.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserDetailsService {

    @Autowired
    private UserDetailsRepository userDetailsRepository;

    @Override
    public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
        com.app.budget.data.UserDetails userDetails = userDetailsRepository.findByUserId(userId);
        if (userDetails != null) {
            return new org.springframework.security.core.userdetails.User(userDetails.getUserId(), userDetails.getPassword(), new java.util.ArrayList<>());
        }
        return null;
    }


}
