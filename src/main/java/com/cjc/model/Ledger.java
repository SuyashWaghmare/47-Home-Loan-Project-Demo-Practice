package com.cjc.model;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Ledger {
	
private	int ledgerId;
private	String ledgerCreatedDate;
private	Double totalLoanAmount;
private	double payableAmountwithinterest;
private	int tenure;
private	double mounthlyEMI;
private   double amountPaidtillDate;
private   double reaminingAmount;
private   String nextEmiDatestart;
private   String nextEmiDateEnd;
private   int defaulterCount;
private    String previousEmiStatus;
private   String currentMonthEmiStatus;
private    String loanEndDate;
private    String loanStatus;
    
}
