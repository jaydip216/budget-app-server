package com.app.budget.domain;

import lombok.Data;

@Data
public class UserDetailsRequest {

	private String userId;
    private String password;
    private String email;
    private String mobileNumber;
    
}
