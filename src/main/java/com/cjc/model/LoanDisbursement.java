package com.cjc.model;

import lombok.Data;

@Data
public class LoanDisbursement {

	private	int agreemenId;
	private	int loanNo;
	private	String agrrementDate;
	private	String amountPayTime;
	private	Double totalAmount;
	private	String bankName;
	private	Double accountNumber;
	private	String IFSCCode;
	private	String accountType;
	private	double transferAmount;
	private	String paymentStatus;
	private	String amountPaidDate;
}
