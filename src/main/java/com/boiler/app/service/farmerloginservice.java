package com.boiler.app.service;

import java.util.List;


import com.boiler.app.pojo.consumerlogin;
import com.boiler.app.pojo.farmerlogin;

public interface farmerloginservice {
	public void addfl(farmerlogin login);
	public List<farmerlogin> getfl();
}
