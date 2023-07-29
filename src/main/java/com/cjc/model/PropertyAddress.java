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
public class PropertyAddress {

	@Id
	public int aid;
	public String areaName;
	public String cityName;
	public String district;
	public String state;
	public double pincode;
	public String streetName;
	
}
