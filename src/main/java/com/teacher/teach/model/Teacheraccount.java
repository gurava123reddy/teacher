package com.teacher.teach.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Teacheraccount")
public class Teacheraccount {
	
	@Id
	private int id;
	private String accountno;
	private String ifsc;	
	private int teacherno;
	public String getAccountno() {
		return accountno;
	}
	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public int getTeacherno() {
		return teacherno;
	}
	public void setTeacherno(int teacherno) {
		this.teacherno = teacherno;
	}
	@Override
	public String toString() {
		return "Teacheraccount [accountno=" + accountno + ", ifsc=" + ifsc + ", teacherno=" + teacherno + "]";
	}
	
	

}
