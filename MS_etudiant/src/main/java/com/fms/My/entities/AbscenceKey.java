package com.fms.My.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Embeddable
public class AbscenceKey implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@ManyToOne
    @JoinColumn(name="id_s")
 private Student student;
 @ManyToOne
    @JoinColumn(name="id_sub")
 private Subject Subject;
 
 @NotBlank(message="date deb is mondary")
  private String date_deb;
 @NotBlank(message = "date fin is mondary")
 private String date_fin;
public Student getStudent() {
	return student;
}
public void setStudent(Student student) {
	this.student = student;
}
public Subject getSubject() {
	return Subject;
}
public void setSubject(Subject subject) {
	Subject = subject;
}
public String getDate_deb() {
	return date_deb;
}
public void setDate_deb(String date_deb) {
	this.date_deb = date_deb;
}
public String getDate_fin() {
	return date_fin;
}
public void setDate_fin(String date_fin) {
	this.date_fin = date_fin;
}
 

}
