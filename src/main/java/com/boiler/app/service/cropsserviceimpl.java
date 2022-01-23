package com.boiler.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boiler.app.pojo.crops;
import com.boiler.app.repo.consumerloginrepo;
import com.boiler.app.repo.cropsrepo;
@Service
@Transactional
public class cropsserviceimpl implements cropsservice {
	@Autowired
	cropsrepo pRepo;
	@Override
	public void addcp(crops reg) {
		// TODO Auto-generated method stub
		pRepo.addcp(reg);
	}

	@Override
	public List<crops> getcp() {
		// TODO Auto-generated method stub
		return pRepo.getcp();
	}

}
