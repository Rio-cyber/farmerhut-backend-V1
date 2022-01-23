package com.boiler.app.repo;

import java.util.List;

import com.boiler.app.pojo.crops;

public interface cropsrepo {
	public void addcp(crops reg);
	public List<crops> getcp();
}
