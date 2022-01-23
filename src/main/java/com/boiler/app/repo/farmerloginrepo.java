package com.boiler.app.repo;

import java.util.List;

import com.boiler.app.pojo.farmerlogin;

public interface farmerloginrepo {
	public void addfl(farmerlogin login);
	public List<farmerlogin> getfl();
}
