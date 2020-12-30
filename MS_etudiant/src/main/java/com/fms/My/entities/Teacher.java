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
public class Teacher {
	@Id 
	@GeneratedValue
	private Long id_t;
	@NotBlank(message = "nom is mandatory")
	private String nom_t;
	@NotBlank(message = "prenom is mandatory")
	private String prenom_t;
	@NotBlank(message = "dt_n is mandatory")
	private String dt_n_t;
	@NotBlank(message = "l_n is mandatory")
	private String l_n_t;
	@Lob 
	private String image_t;
	@NotBlank(message = "email is mandatory")
	private String e_mail_t;
	@NotBlank(message = "N matricule is mandatory")
	private Long mat_t;
	@NotBlank(message = "date is Mondary")
	private String date_emb;
	public Long getId_t() {
		return id_t;
	}
	public void setId_t(Long id_t) {
		this.id_t = id_t;
	}
	public String getNom_t() {
		return nom_t;
	}
	public void setNom_t(String nom_t) {
		this.nom_t = nom_t;
	}
	public String getPrenom_t() {
		return prenom_t;
	}
	public void setPrenom_t(String prenom_t) {
		this.prenom_t = prenom_t;
	}
	public String getDt_n_t() {
		return dt_n_t;
	}
	public void setDt_n_t(String dt_n_t) {
		this.dt_n_t = dt_n_t;
	}
	public String getL_n_t() {
		return l_n_t;
	}
	public void setL_n_t(String l_n_t) {
		this.l_n_t = l_n_t;
	}
	public String getImage_t() {
		return image_t;
	}
	public void setImage_t(String image_t) {
		this.image_t = image_t;
	}
	public String getE_mail_t() {
		return e_mail_t;
	}
	public void setE_mail_t(String e_mail_t) {
		this.e_mail_t = e_mail_t;
	}
	public Long getMat_t() {
		return mat_t;
	}
	public void setMat_t(Long mat_t) {
		this.mat_t = mat_t;
	}
	public String getDate_emb() {
		return date_emb;
	}
	public void setDate_emb(String date_emb) {
		this.date_emb = date_emb;
	}
	

}
