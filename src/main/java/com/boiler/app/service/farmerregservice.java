package com.boiler.app.service;

import java.util.List;

import com.boiler.app.pojo.farmerreg;

public interface farmerregservice {
	public void addfr(farmerreg reg);
	public List<farmerreg> getfr();
}
