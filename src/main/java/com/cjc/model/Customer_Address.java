package com.cjc.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Customer_Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int addressid;
	@OneToOne(cascade = CascadeType.ALL)
	private Customer_Permanent_Adress permanent;
	@OneToOne(cascade = CascadeType.ALL)
	private Customer_Local_Address local;


}
