package com.app.budget.data;

import lombok.Data;

@Data
public class Transaction {
    private double amount;
    private String date;
    private String category;
    private String description;
    private String type;
}
