package com.boiler.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boiler.app.pojo.farmerlogin;
import com.boiler.app.repo.consumerloginrepo;
import com.boiler.app.repo.farmerloginrepo;

@Service
@Transactional
public class farmerloginserviceimpl implements farmerloginservice{
	@Autowired
	farmerloginrepo pRepo;
	@Override
	public void addfl(farmerlogin login) {
		// TODO Auto-generated method stub
		pRepo.addfl(login);
	}

	@Override
	public List<farmerlogin> getfl() {
		// TODO Auto-generated method stub
		return pRepo.getfl();
	}

}
