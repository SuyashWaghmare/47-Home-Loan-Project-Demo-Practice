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
public class CustomerVerification {

	int verificationID;
	String verificationDate;
	String status;
	String Remarks;
	
}
