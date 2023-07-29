package com.model;
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
public class Mortgage {
	@Id
	private int mid;
	private double mpropertyValue;
	private String mpropertyType;
	private byte[] mpropertyProof;
	private double mLoanOnProperty;
	private byte[] mPropertyInsurance;
	
	

}
