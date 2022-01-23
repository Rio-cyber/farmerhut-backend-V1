package com.boiler.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boiler.app.pojo.consumerregister;
import com.boiler.app.repo.customerregrepo;
@Service
@Transactional
public class customerregserviceimpl implements customerregservice {
	@Autowired
	customerregrepo pRepo;
	@Override
	public void addcr(consumerregister reg) {
		// TODO Auto-generated method stub
		pRepo.addcr(reg);
	}

	@Override
	public List<consumerregister> getcr() {
		// TODO Auto-generated method stub
		return pRepo.getcr();
	}

}
