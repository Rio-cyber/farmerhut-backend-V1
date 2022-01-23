package com.boiler.app.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="farmerlogin123")
public class farmerlogin {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int flogid;
	private String farmeremail;
	private String password;
	public farmerlogin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public farmerlogin(int logid, String farmeremail, String password) {
		super();
		this.flogid = logid;
		this.farmeremail = farmeremail;
		this.password = password;
	}
	public int getLogid() {
		return flogid;
	}
	public void setLogid(int logid) {
		this.flogid = logid;
	}
	public String getFarmeremail() {
		return farmeremail;
	}
	public void setFarmeremail(String farmeremail) {
		this.farmeremail = farmeremail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
