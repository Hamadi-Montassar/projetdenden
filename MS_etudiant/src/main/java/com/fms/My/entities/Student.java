package com.fms.My.entities;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import lombok.*;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {
	@Id 
	@GeneratedValue
	private Long id_s;
	@NotBlank(message = "nom is mandatory")
	private String nom_s;
	@NotBlank(message = "prenom is mandatory")
	private String prenom_s;
	@NotBlank(message = "dt_n is mandatory")
	private String dt_n_s;
	@NotBlank(message = "l_n is mandatory")
	private String l_n_s;
	@Lob 
	private String image_s;
	@NotBlank(message = "email is mandatory")
	private String e_mail_s;
	@NotBlank(message = "N card is mandatory")
	private Long ncs;
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "level_id", referencedColumnName = "id_l")
    private Level level;
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Specialty_id", referencedColumnName = "id_sp")
    private  Specialty specialty;

	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "groupe_id", referencedColumnName = "id_g")
    private  Groupe groupe;

	

	public Level getLevel() {
		return level;
	}
	public void setLevel(Level level) {
		this.level = level;
	}
	public Specialty getSpecialty() {
		return specialty;
	}
	public void setSpecialty(Specialty specialty) {
		this.specialty = specialty;
	}
	public Groupe getGroupe() {
		return groupe;
	}
	public void setGroupe(Groupe groupe) {
		this.groupe = groupe;
	}
	
	public Long getId_s() {
		return id_s;
	}
	public void setId_s(Long id_s) {
		this.id_s = id_s;
	}
	public String getNom_s() {
		return nom_s;
	}
	public void setNom_s(String nom_s) {
		this.nom_s = nom_s;
	}
	public String getPrenom_s() {
		return prenom_s;
	}
	public void setPrenom_s(String prenom_s) {
		this.prenom_s = prenom_s;
	}
	public String getDt_n_s() {
		return dt_n_s;
	}
	public void setDt_n_s(String dt_n_s) {
		this.dt_n_s = dt_n_s;
	}
	public String getL_n_s() {
		return l_n_s;
	}
	public void setL_n_s(String l_n_s) {
		this.l_n_s = l_n_s;
	}
	public String getImage_s() {
		return image_s;
	}
	public void setImage_s(String image_s) {
		this.image_s = image_s;
	}
	public String getE_mail_s() {
		return e_mail_s;
	}
	public void setE_mail_s(String e_mail_s) {
		this.e_mail_s = e_mail_s;
	}
	public Long getNcs() {
		return ncs;
	}
	public void setNcs(Long ncs) {
		this.ncs = ncs;
	}
	
	
	}




