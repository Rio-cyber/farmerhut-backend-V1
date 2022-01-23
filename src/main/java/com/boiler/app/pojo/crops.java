package com.boiler.app.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="crops123")
public class crops {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	public crops() {
		super();
		// TODO Auto-generated constructor stub
	}
	public crops(int cid, String price, String cropname, String location, String farmername) {
		super();
		this.cid = cid;
		this.price = price;
		this.cropname = cropname;
		this.location = location;
		this.farmername = farmername;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getCropname() {
		return cropname;
	}
	public void setCropname(String cropname) {
		this.cropname = cropname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getFarmername() {
		return farmername;
	}
	public void setFarmername(String farmername) {
		this.farmername = farmername;
	}
	private String price;
	private String cropname;
	private String location;
	private String farmername;
	
}
