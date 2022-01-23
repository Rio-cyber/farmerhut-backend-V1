package com.boiler.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boiler.app.pojo.farmerreg;
import com.boiler.app.repo.customerregrepo;
import com.boiler.app.repo.farmerregrepo;
@Service
@Transactional
public class farmerregserviceimpl implements farmerregservice {
	@Autowired
	farmerregrepo pRepo;
	@Override
	public void addfr(farmerreg reg) {
		// TODO Auto-generated method stub
		pRepo.addfr(reg);
	}

	@Override
	public List<farmerreg> getfr() {
		// TODO Auto-generated method stub
		return pRepo.getfr();
	}

}
