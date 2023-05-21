package com.app.budget.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.budget.constants.ApplicationConstants;
import com.app.budget.domain.UserDetailsRequest;
import com.app.budget.domain.UserDetailsResponse;

@RestController(value = ApplicationConstants.V1_VERSON + "user")
public class UserDetailsController {

	@GetMapping
	public ResponseEntity<UserDetailsResponse> getUser() {
		return ResponseEntity.ok(null);
	}

	@PutMapping
	public ResponseEntity<UserDetailsResponse> updateUser(@RequestBody UserDetailsRequest user) {
		return ResponseEntity.ok(null);
	}

}
