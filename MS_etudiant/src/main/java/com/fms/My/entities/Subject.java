package com.fms.My.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Subject {
	@Id 
	@GeneratedValue
	private Long id_sub;
	@NotBlank(message = "libelle subject is mandatory")
	private String libelle_sub;
	@NotBlank(message="number of hours is mondary")
	private int nbr_h;
	@NotBlank(message="coefficient is mondary")
	private float coef;
	public Long getId_sub() {
		return id_sub;
	}
	public void setId_sub(Long id_sub) {
		this.id_sub = id_sub;
	}
	public String getLibelle_sub() {
		return libelle_sub;
	}
	public void setLibelle_sub(String libelle_sub) {
		this.libelle_sub = libelle_sub;
	}
	public int getNbr_h() {
		return nbr_h;
	}
	public void setNbr_h(int nbr_h) {
		this.nbr_h = nbr_h;
	}
	public float getCoef() {
		return coef;
	}
	public void setCoef(float coef) {
		this.coef = coef;
	}

}
