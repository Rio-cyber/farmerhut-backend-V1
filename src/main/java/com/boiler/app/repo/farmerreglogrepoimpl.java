package com.boiler.app.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.boiler.app.pojo.farmerlogin;
@Repository
public class farmerreglogrepoimpl implements farmerloginrepo {
	@Autowired
	EntityManager eMan;
	@Override
	public void addfl(farmerlogin login) {
		// TODO Auto-generated method stub
		eMan.persist(login);
	}

	@Override
	public List<farmerlogin> getfl() {
		// TODO Auto-generated method stub
		Query qry = eMan.createQuery("from farmerlogin");
		return qry.getResultList();
	}

}
