package com.cjc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BankAddress {

	@Id
	private int aid;
	private String areaName;
	private String streetName;
	private String cityName;
	private long pincode;
	private String district;
	private String state;
	
	
}
