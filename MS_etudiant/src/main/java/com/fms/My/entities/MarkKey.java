package com.fms.My.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Embeddable
public class MarkKey implements Serializable {
	@Transient
	private static final long serialVersionUID = 1L;
	@ManyToOne
	    @JoinColumn(name="id_s")
	 private Student student;
	 @ManyToOne
	    @JoinColumn(name="id_sub")
	 private Subject Subject;
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
	 
	      
	

}
