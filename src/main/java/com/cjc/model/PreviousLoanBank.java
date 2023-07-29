package com.cjc.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PreviousLoanBank {

	public String bankName;
	public String branchName;
	public double branchCode;
	@Id
	public int branchID;
	public String branchType;
	public String IFSCCode;
	public String MICRCode;
	public double contactNo;
	@OneToOne(cascade = CascadeType.ALL)
	public BankAddress bankAddress;
	public String Email;
	public String status;
	
}
