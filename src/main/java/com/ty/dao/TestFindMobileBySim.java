package com.ty.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.dto.Sim;

public class TestFindMobileBySim {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		Sim sim = em.find(Sim.class, 1);
		if(sim!=null) {
		System.out.println("---------Sim info---------");
		System.out.println("Sim name is : " + sim.getName());
		System.out.println("Sim id is : " + sim.getId());
		System.out.println("Sim provider is : " + sim.getProvider());
		System.out.println("Sim belongs to : "+sim.getMobile());
		}
		else {
			System.out.println("Sim details not found");
		}
		Sim sim1 = em.find(Sim.class, 1);
		if(sim1!=null) {
		System.out.println("---------Sim info---------");
		System.out.println("Sim name is : " + sim1.getName());
		System.out.println("Sim id is : " + sim1.getId());
		System.out.println("Sim provider is : " + sim1.getProvider());
		System.out.println("Sim belongs to : "+sim1.getMobile());
		}
		else {
			System.out.println("Sim details not found");
		}
	}
}