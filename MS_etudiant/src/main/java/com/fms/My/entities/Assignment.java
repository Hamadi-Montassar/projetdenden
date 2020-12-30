package com.fms.My.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Data
@AllArgsConstructor 
@NoArgsConstructor
@ToString
public class Assignment {
	@EmbeddedId
	private AssignmentKey assignmentKey;

	public AssignmentKey getAssignmentKey() {
		return assignmentKey;
	}

	public void setAssignmentKey(AssignmentKey assignmentKey) {
		this.assignmentKey = assignmentKey;
	}
	
	

}
