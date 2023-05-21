package com.app.budget.domain;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class TransactionResponse {
	private String transactionId;
	private BigDecimal amount;
	private String transactionDate;
	private String category;
}
