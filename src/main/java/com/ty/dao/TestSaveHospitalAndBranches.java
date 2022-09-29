package com.ty.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Branch;
import com.ty.dto.Hospital;

public class TestSaveHospitalAndBranches {

	public static void main(String[] args) {
		Hospital hospital = new Hospital();
		hospital.setName("apollo");
		hospital.setWebsite("www.apollohospitals.com");
		Branch branch1 = new Branch();
		branch1.setHospital(hospital);
		branch1.setCity("bangalore");
		branch1.setLocation("kathrikuppe");
		branch1.setPhone(9986526545L);
		Branch branch2 = new Branch();
		branch2.setHospital(hospital);
		branch2.setCity("bangalore");
		branch2.setLocation("rajajinagar");
		branch2.setPhone(9662023331L);
		Branch branch3 = new Branch();
		branch3.setHospital(hospital);
		branch3.setCity("bangalore");
		branch3.setLocation("btm");
		branch3.setPhone(8889623154L);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(hospital);
		em.persist(branch1);
		em.persist(branch2);
		em.persist(branch3);
		et.commit();
	}
}