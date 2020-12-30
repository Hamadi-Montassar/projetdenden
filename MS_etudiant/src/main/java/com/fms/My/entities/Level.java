package com.fms.My.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
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
public class Level {
	@Id 
	@GeneratedValue
	private Long id_l;
	@NotBlank(message = "libelle level is mandatory")
	private String libelle_l;
	 @OneToOne(mappedBy = "level")
	    private Student student;
	public Long getId_l() {
		return id_l;
	}
	public void setId_l(Long id_l) {
		this.id_l = id_l;
	}
	public String getLibelle_l() {
		return libelle_l;
	}
	public void setLibelle_l(String libelle_l) {
		this.libelle_l = libelle_l;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	

}
