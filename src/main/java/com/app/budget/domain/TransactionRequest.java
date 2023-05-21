package com.app.budget.domain;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class TransactionRequest {

	private BigDecimal amount;
	private String category;
	private String dateFormat;
	private String transactionDate;

}
