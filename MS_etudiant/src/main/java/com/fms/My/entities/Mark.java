package com.fms.My.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
public class Mark {
	@EmbeddedId
	private MarkKey mKey;
	@NotBlank(message="date exam is mondary")
	private String date_ex;
	
	@NotBlank(message = "mark exam is mondary")
	private float mark;

	public MarkKey getmKey() {
		return mKey;
	}

	public void setmKey(MarkKey mKey) {
		this.mKey = mKey;
	}

	public String getDate_ex() {
		return date_ex;
	}

	public void setDate_ex(String date_ex) {
		this.date_ex = date_ex;
	}

	public float getMark() {
		return mark;
	}

	public void setMark(float mark) {
		this.mark = mark;
	}
	

}
