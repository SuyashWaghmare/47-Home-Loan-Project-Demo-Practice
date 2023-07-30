package com.cjc.model;


import javax.persistence.OneToOne;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LoanDetails {
	@Id
	private int loanId;
	private int loanNo;
	@OneToOne
	//private EMIDetails emidetails;
	private double loanAmount;
	private int rateOfIntrest;
	private int tenure;
	private double totalAmounttobrpaid;
	private int processingFees;
	private double totalIntrest;
	private String sanctionDate;
	private String remark;
	private String status;
	
	

}
