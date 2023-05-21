package com.app.budget.domain;

import lombok.Data;

@Data
public class AuthRequest {
	private String userId;
	private String password;
}
