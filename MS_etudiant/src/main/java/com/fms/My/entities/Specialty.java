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
public class Specialty {
	@Id 
	@GeneratedValue
	private Long id_sp;
	@NotBlank(message = "libelle speciality is mandatory")
	private String libelle_sp;
	 @OneToOne(mappedBy = "specialty")
	    private Student student;
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Long getId_sp() {
		return id_sp;
	}
	public void setId_sp(Long id_sp) {
		this.id_sp = id_sp;
	}
	public String getLibelle_sp() {
		return libelle_sp;
	}
	public void setLibelle_sp(String libelle_sp) {
		this.libelle_sp = libelle_sp;
	}
	

}
