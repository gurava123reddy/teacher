package com.teacher.teach.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Grade")
public class Grade {
	
	private int classno;
	private int periodno;
	private String subject;
	@Id
	private int teacherno;
	
	//public Grade() {}

	public int getClassno() {
		return classno;
	}

	public void setClassno(int classno) {
		this.classno = classno;
	}

	public int getPeriodno() {
		return periodno;
	}

	public void setPeriodno(int periodno) {
		this.periodno = periodno;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getTeacherno() {
		return teacherno;
	}

	public void setTeacherno(int teacherno) {
		this.teacherno = teacherno;
	}

	@Override
	public String toString() {
		return "Grade [classno=" + classno + ", periodno=" + periodno + ", subject=" + subject + ", teacherno="
				+ teacherno + "]";
	}
	

}
