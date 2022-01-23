package com.boiler.app.repo;

import java.util.List;

import com.boiler.app.pojo.consumerregister;

public interface customerregrepo {
	public void addcr(consumerregister reg);
	public List<consumerregister> getcr();

}
