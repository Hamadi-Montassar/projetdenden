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
public class Groupe {
	@Id 
	@GeneratedValue
	private Long id_g;
	@NotBlank(message = "libelle groupe is mandatory")
	private String libelle_g;
	 @OneToOne(mappedBy = "groupe")
	    private Student student;
	public Long getId_g() {
		return id_g;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public void setId_g(Long id_g) {
		this.id_g = id_g;
	}
	public String getLibelle_g() {
		return libelle_g;
	}
	public void setLibelle_g(String libelle_g) {
		this.libelle_g = libelle_g;
	}
	

}
