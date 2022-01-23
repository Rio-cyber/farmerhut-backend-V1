package com.boiler.app.pojo;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="consumerlogin123")
public class consumerlogin {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int logid;
	private String customerName;
private String password;
public consumerlogin() {
	super();
	// TODO Auto-generated constructor stub
}
public consumerlogin(int logid, String customerName, String password) {
	super();
	this.logid = logid;
	this.customerName = customerName;
	this.password = password;
}
public int getLogid() {
	return logid;
}
public void setLogid(int logid) {
	this.logid = logid;
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

}
