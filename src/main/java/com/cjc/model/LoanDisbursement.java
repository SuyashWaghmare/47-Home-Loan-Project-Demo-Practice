package com.cjc.model;

import lombok.Data;

@Data
public class LoanDisbursement {

	int agreemenId;
	int loanNo;
	String agrrementDate;
	String amountPayTime;
	Double totalAmount;
	String bankName;
	Double accountNumber;
	String IFSCCode;
	String accountType;
	double transferAmount;
	String paymentStatus;
	String amountPaidDate;
}
