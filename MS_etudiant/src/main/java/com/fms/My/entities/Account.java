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
public class Account {
	@Id 
	@GeneratedValue
	private Long id_a;
	@NotBlank(message="login is mondary")
	private String login;
	@NotBlank(message="password is mondary")
	private String password;
	@NotBlank(message ="profile is mondary")
	private String profile;
	public Long getId_a() {
		return id_a;
	}
	public void setId_a(Long id_a) {
		this.id_a = id_a;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	
	

}
