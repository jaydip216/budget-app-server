package com.app.budget.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.budget.constants.ApplicationConstants;
import com.app.budget.domain.TransactionRequest;
import com.app.budget.domain.TransactionResponse;

@RestController
@RequestMapping(value = ApplicationConstants.V1_VERSON + "transaction")
public class TransactionController {

	@GetMapping
	public ResponseEntity<List<TransactionResponse>> getTransactionsWithinDateRange(
			@RequestParam(value = "from", required = false) String fromDate,
			@RequestParam(value = "to", required = false) String toDate) {
		List<TransactionResponse> transactions = new ArrayList<>();
		return ResponseEntity.ok(transactions);
	}

	@GetMapping("/{transactionId}")
	public ResponseEntity<TransactionResponse> getTransactionById(@PathVariable String transactionId) {
		TransactionResponse transaction = new TransactionResponse();
		return ResponseEntity.ok(transaction);
	}

	@PostMapping
	public ResponseEntity<TransactionResponse> createTransaction(@RequestBody TransactionRequest transaction) {
		return ResponseEntity.status(HttpStatus.CREATED).body(null);
	}

	@PutMapping("/{transactionId}")
	public ResponseEntity<TransactionResponse> updateTransaction(@PathVariable String transactionId,
			@RequestBody TransactionRequest transaction) {
		return ResponseEntity.ok(null);
	}

	@DeleteMapping("/{transactionId}")
	public ResponseEntity<Void> deleteTransaction(@PathVariable String transactionId) {
		return ResponseEntity.noContent().build();
	}

}
