package com.boiler.app.service;

import java.util.List;

import com.boiler.app.pojo.consumerlogin;

public interface consumerloginservice {
	public void addcl(consumerlogin login);
	public List<consumerlogin> getcl();

}
