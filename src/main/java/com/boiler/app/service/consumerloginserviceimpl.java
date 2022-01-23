package com.boiler.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boiler.app.pojo.consumerlogin;
import com.boiler.app.repo.consumerloginrepo;

@Service
@Transactional
public class consumerloginserviceimpl implements consumerloginservice {
	@Autowired
	consumerloginrepo pRepo;
	@Override
	public void addcl(consumerlogin login) {
		pRepo.addcl(login);
		
	}

	@Override
	public List<consumerlogin> getcl() {
	return pRepo.getcl();
	}

}
