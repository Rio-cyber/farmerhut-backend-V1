package com.boiler.app.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.boiler.app.pojo.crops;
@Repository
public class cropsrepoimpl implements cropsrepo {
	@Autowired
	EntityManager eMan;
	@Override
	public void addcp(crops reg) {
		// TODO Auto-generated method stub
		eMan.persist(reg);
	}

	@Override
	public List<crops> getcp() {
		// TODO Auto-generated method stub
		Query qry = eMan.createQuery("from crops");
		return qry.getResultList();
	}

}
