package com.boiler.app.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="farmerregister123")
public class farmerreg {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int fregid;
		public farmerreg() {
			super();
			// TODO Auto-generated constructor stub
		}
		public farmerreg(int fregid, String fname, String lname, String farmeremail, long mobilenumber, String password,
				String confirmpassword, String businessname, String speciality, String list) {
			super();
			this.fregid = fregid;
			this.fname = fname;
			this.lname = lname;
			this.farmeremail = farmeremail;
			this.mobilenumber = mobilenumber;
			this.password = password;
			this.confirmpassword = confirmpassword;
			this.businessname = businessname;
			this.speciality = speciality;
			this.list = list;
		}
		public int getFregid() {
			return fregid;
		}
		public void setFregid(int fregid) {
			this.fregid = fregid;
		}
		public String getFname() {
			return fname;
		}
		public void setFname(String fname) {
			this.fname = fname;
		}
		public String getLname() {
			return lname;
		}
		public void setLname(String lname) {
			this.lname = lname;
		}
		public String getFarmeremail() {
			return farmeremail;
		}
		public void setFarmeremail(String farmeremail) {
			this.farmeremail = farmeremail;
		}
		public long getMobilenumber() {
			return mobilenumber;
		}
		public void setMobilenumber(long mobilenumber) {
			this.mobilenumber = mobilenumber;
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
		public String getBusinessname() {
			return businessname;
		}
		public void setBusinessname(String businessname) {
			this.businessname = businessname;
		}
		public String getSpeciality() {
			return speciality;
		}
		public void setSpeciality(String speciality) {
			this.speciality = speciality;
		}
		public String getList() {
			return list;
		}
		public void setList(String list) {
			this.list = list;
		}
		private String fname;
		private 	String lname;
		private String farmeremail;
		private long mobilenumber;
	private String password;
	private String confirmpassword;
	private String businessname;
	private String speciality;
	private String list;
	
	}

