package com.boiler.app.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.boiler.app.pojo.consumerlogin;
@Repository
public class consumerloginrepoimpl implements consumerloginrepo {
	@Autowired
	EntityManager eMan;
	@Override
	public void addcl(consumerlogin login) {
		eMan.persist(login);
		
	}

	@Override
	public List<consumerlogin> getcl() {
		// TODO Auto-generated method stub
		Query qry = eMan.createQuery("from consumerlogin");
		return qry.getResultList();
	}

}
