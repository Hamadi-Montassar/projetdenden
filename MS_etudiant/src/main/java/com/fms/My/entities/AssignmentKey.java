package com.fms.My.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;
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
public class AssignmentKey implements Serializable {

	/**
	 * 
	 */
	@Transient
	private static final long serialVersionUID = 1L;
	@ManyToOne
    @JoinColumn(name="id_t")
 private Teacher teacher;
 @ManyToOne
    @JoinColumn(name="id_sub")
 private Subject Subject;
 
 @NotBlank(message="date of assignment is mondary")
  private String date_assignment;

public Teacher getTeacher() {
	return teacher;
}

public void setTeacher(Teacher teacher) {
	this.teacher = teacher;
}

public Subject getSubject() {
	return Subject;
}

public void setSubject(Subject subject) {
	Subject = subject;
}

public String getDate_assignment() {
	return date_assignment;
}

public void setDate_assignment(String date_assignment) {
	this.date_assignment = date_assignment;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}
 

}
