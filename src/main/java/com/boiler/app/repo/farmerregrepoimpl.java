package com.boiler.app.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.boiler.app.pojo.farmerreg;
@Repository
public class farmerregrepoimpl implements farmerregrepo {
	@Autowired
	EntityManager eMan;
	@Override
	public void addfr(farmerreg reg) {
		// TODO Auto-generated method stub
		eMan.persist(reg);
	}

	@Override
	public List<farmerreg> getfr() {
		// TODO Auto-generated method stub
		Query qry = eMan.createQuery("from farmerreg");
		return qry.getResultList();
	}

}
