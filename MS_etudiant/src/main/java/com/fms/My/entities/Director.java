package com.fms.My.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
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
public class Director {
	@Id 
	@GeneratedValue
	private Long id_d;
	@NotBlank(message = "nom is mandatory")
	private String nom_d;
	@NotBlank(message = "prenom is mandatory")
	private String prenom_d;
	@NotBlank(message = "dt_n is mandatory")
	private String dt_n_d;
	@NotBlank(message = "l_n is mandatory")
	private String l_n_d;
	@Lob 
	private String image_d;
	@NotBlank(message = "email is mandatory")
	private String e_mail_d;
	@NotBlank(message = "N matricule is mandatory")
	private Long mat_d;
	@NotBlank(message = "date is Mondary")
	private String date_emb;
	public Long getId_d() {
		return id_d;
	}
	public void setId_d(Long id_d) {
		this.id_d = id_d;
	}
	public String getNom_d() {
		return nom_d;
	}
	public void setNom_d(String nom_d) {
		this.nom_d = nom_d;
	}
	public String getPrenom_d() {
		return prenom_d;
	}
	public void setPrenom_d(String prenom_d) {
		this.prenom_d = prenom_d;
	}
	public String getDt_n_d() {
		return dt_n_d;
	}
	public void setDt_n_d(String dt_n_d) {
		this.dt_n_d = dt_n_d;
	}
	public String getL_n_d() {
		return l_n_d;
	}
	public void setL_n_d(String l_n_d) {
		this.l_n_d = l_n_d;
	}
	public String getImage_d() {
		return image_d;
	}
	public void setImage_d(String image_d) {
		this.image_d = image_d;
	}
	public String getE_mail_d() {
		return e_mail_d;
	}
	public void setE_mail_d(String e_mail_d) {
		this.e_mail_d = e_mail_d;
	}
	public Long getMat_d() {
		return mat_d;
	}
	public void setMat_d(Long mat_d) {
		this.mat_d = mat_d;
	}
	public String getDate_emb() {
		return date_emb;
	}
	public void setDate_emb(String date_emb) {
		this.date_emb = date_emb;
	}
	

}
