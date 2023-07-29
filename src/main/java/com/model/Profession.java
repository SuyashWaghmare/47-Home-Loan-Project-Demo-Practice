package com.model;

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
public class Profession {
	
	@Id
	private int pid;
	private String pType;
	private double psalary;
	//private psalaryType(cash/account);
	private String pworkingperiod;
	private String pDesignation;
	private byte[]  pSalarySlip;
	
	

}
