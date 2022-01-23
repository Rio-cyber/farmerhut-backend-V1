package com.boiler.app.service;

import java.util.List;

import com.boiler.app.pojo.consumerregister;

public interface customerregservice {
	public void addcr(consumerregister reg);
	public List<consumerregister> getcr();
}
