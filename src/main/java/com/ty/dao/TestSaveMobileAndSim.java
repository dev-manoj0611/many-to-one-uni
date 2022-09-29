package com.ty.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Mobile;
import com.ty.dto.Sim;

public class TestSaveMobileAndSim {

	public static void main(String[] args) {
		Mobile m = new Mobile();
		m.setName("samsung");
		m.setProvider("airtel");
		m.setCost(500);
		Sim sim = new Sim();
		sim.setName("air10");
		sim.setProvider("airtel");
		sim.setMobile(m);
		Sim sim1 = new Sim();
		sim1.setName("air12");
		sim1.setProvider("airtel");
		sim1.setMobile(m);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(m);
		em.persist(sim);
		em.persist(sim1);
		et.commit();
	}
}