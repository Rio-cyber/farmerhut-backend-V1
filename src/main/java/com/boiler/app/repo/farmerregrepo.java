package com.boiler.app.repo;

import java.util.List;

import com.boiler.app.pojo.farmerreg;

public interface farmerregrepo {
	public void addfr(farmerreg reg);
	public List<farmerreg> getfr();
}
