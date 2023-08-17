package com.teacher.teach.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Teacher")
public class Teacher {
	
	@Id
	private int teacherno;
	private String teachername;
	private double teachersalary;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "teacherno", referencedColumnName = "teacherno")
	List<Grade> classList;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "teacherno", referencedColumnName ="teacherno")
	Teacheraccount accountno;
	
	public Teacher() {}
	
	
	public Teacher(int teacherno, String teachername, double teachersalary) {
		this.teacherno = teacherno;
		this.teachername = teachername;
		this.teachersalary = teachersalary;
	}


	public List<Grade> getClassList() {
		return classList;
	}


	public void setClassList(List<Grade> classList) {
		this.classList = classList;
	}


	public Teacheraccount getAccountno() {
		return accountno;
	}


	public void setAccountno(Teacheraccount accountno) {
		this.accountno = accountno;
	}


	public int getTeacherno() {
		return teacherno;
	}
	public void setTeacherno(int teacherno) {
		this.teacherno = teacherno;
	}
	public String getTeachername() {
		return teachername;
	}
	public void setTeachername(String teachername) {
		this.teachername = teachername;
	}
	public double getTeachersalary() {
		return teachersalary;
	}
	public void setTeachersalary(double teachersalary) {
		this.teachersalary = teachersalary;
	}


	@Override
	public String toString() {
		return "Teacher [teacherno=" + teacherno + ", teachername=" + teachername + ", teachersalary=" + teachersalary
				+ "]";
	}
	
	

}
