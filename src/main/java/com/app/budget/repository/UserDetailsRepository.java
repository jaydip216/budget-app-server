package com.app.budget.repository;

import com.app.budget.data.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails, Integer> {
    public UserDetails findByUserId(String userId);

}
