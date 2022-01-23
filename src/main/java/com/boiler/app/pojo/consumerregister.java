package com.boiler.app.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="consumerregister123")
public class consumerregister {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int regid;
	private String customerName;
private String password;
private String confirmpassword;
public consumerregister() {
	super();
	// TODO Auto-generated constructor stub
}
public consumerregister(int regid, String customerName, String password, String confirmpassword) {
	super();
	this.regid = regid;
	this.customerName = customerName;
	this.password = password;
	this.confirmpassword = confirmpassword;
}
public int getRegid() {
	return regid;
}
public void setRegid(int regid) {
	this.regid = regid;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getConfirmpassword() {
	return confirmpassword;
}
public void setConfirmpassword(String confirmpassword) {
	this.confirmpassword = confirmpassword;
}
}
