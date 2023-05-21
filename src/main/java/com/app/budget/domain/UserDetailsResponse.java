package com.app.budget.domain;

import lombok.Data;

@Data
public class UserDetailsResponse {

	private String userId;
	private String email;
    private String mobileNumber;
}
