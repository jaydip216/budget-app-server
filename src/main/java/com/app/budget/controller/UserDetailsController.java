package com.app.budget.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.app.budget.constants.ApplicationConstants;
import com.app.budget.domain.UserDetailsRequest;
import com.app.budget.domain.UserDetailsResponse;

@RestController
@RequestMapping(value = ApplicationConstants.V1_VERSON + "user")
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
