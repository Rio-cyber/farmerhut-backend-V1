package com.boiler.app.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.boiler.app.pojo.consumerregister;
@Repository
public class customerregrepoimpl implements customerregrepo {
	@Autowired
	EntityManager eMan;
	@Override
	public void addcr(consumerregister reg) {
		eMan.persist(reg);
	}

	@Override
	public List<consumerregister> getcr() {
		// TODO Auto-generated method stub
		Query qry = eMan.createQuery("from consumerregister");
		return qry.getResultList();
	}

}
