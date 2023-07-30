package com.cjc.model;

import lombok.Data;

@Data
public class Ledger {
	
	int ledgerId;
	String ledgerCreatedDate;
	Double totalLoanAmount;
	double payableAmountwithinterest;
	int tenure;
	double mounthlyEMI;
    double amountPaidtillDate;
    double reaminingAmount;
    String nextEmiDatestart;
    String nextEmiDateEnd;
    int defaulterCount;
    String previousEmiStatus;
    String currentMonthEmiStatus;
    String loanEndDate;
    String loanStatus;
    
}
