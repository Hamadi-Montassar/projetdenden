package com.fms.My.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Abscence {
	@EmbeddedId
	private AbscenceKey abscenceKey;
	
	private String justification;

	public AbscenceKey getAbscenceKey() {
		return abscenceKey;
	}

	public void setAbscenceKey(AbscenceKey abscenceKey) {
		this.abscenceKey = abscenceKey;
	}

	public String getJustification() {
		return justification;
	}

	public void setJustification(String justification) {
		this.justification = justification;
	}
	
	
	
	
	

}
