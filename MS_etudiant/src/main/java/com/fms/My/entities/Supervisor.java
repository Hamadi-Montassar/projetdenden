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
public class Supervisor {
	@Id 
	@GeneratedValue
	private Long id_sup;
	@NotBlank(message = "nom is mandatory")
	private String nom_sup;
	@NotBlank(message = "prenom is mandatory")
	private String prenom_sup;
	@NotBlank(message = "dt_n is mandatory")
	private String dt_n_sup;
	@NotBlank(message = "l_n is mandatory")
	private String l_n_sup;
	@Lob 
	private String image_sup;
	@NotBlank(message = "email is mandatory")
	private String e_mail_sup;
	@NotBlank(message = "N matricule is mandatory")
	private Long mat_sup;
	@NotBlank(message = "date is Mondary")
	private String date_emb;
	public Long getId_sup() {
		return id_sup;
	}
	public void setId_sup(Long id_sup) {
		this.id_sup = id_sup;
	}
	public String getNom_sup() {
		return nom_sup;
	}
	public void setNom_sup(String nom_sup) {
		this.nom_sup = nom_sup;
	}
	public String getPrenom_sup() {
		return prenom_sup;
	}
	public void setPrenom_sup(String prenom_sup) {
		this.prenom_sup = prenom_sup;
	}
	public String getDt_n_sup() {
		return dt_n_sup;
	}
	public void setDt_n_sup(String dt_n_sup) {
		this.dt_n_sup = dt_n_sup;
	}
	public String getL_n_sup() {
		return l_n_sup;
	}
	public void setL_n_sup(String l_n_sup) {
		this.l_n_sup = l_n_sup;
	}
	public String getImage_sup() {
		return image_sup;
	}
	public void setImage_sup(String image_sup) {
		this.image_sup = image_sup;
	}
	public String getE_mail_sup() {
		return e_mail_sup;
	}
	public void setE_mail_sup(String e_mail_sup) {
		this.e_mail_sup = e_mail_sup;
	}
	public Long getMat_sup() {
		return mat_sup;
	}
	public void setMat_sup(Long mat_sup) {
		this.mat_sup = mat_sup;
	}
	public String getDate_emb() {
		return date_emb;
	}
	public void setDate_emb(String date_emb) {
		this.date_emb = date_emb;
	}
	

}
