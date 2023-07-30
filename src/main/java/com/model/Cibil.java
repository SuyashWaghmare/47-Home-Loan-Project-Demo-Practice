package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Builder
public class Cibil {
	
	@Id
	private int cibilId;
	private int cibilScore;
	private String cibilScoreDateTime;
	private String status;
	private String remark;
    
}
