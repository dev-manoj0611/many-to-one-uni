package com.ty.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.dto.Branch;
import com.ty.dto.Hospital;

public class TestGetHospitalNameByBranch {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		Branch fbranch = em.find(Branch.class, 2);
		if(fbranch!=null) {
			System.out.println("Branch belongs to : "+fbranch.getHospital());
			System.out.println("Branch id is : "+fbranch.getId());
			System.out.println("Branch name is : "+fbranch.getCity());
			System.out.println("Branch located at : "+fbranch.getLocation());
			System.out.println("Contact branch at : "+fbranch.getPhone());
		}
		else {
			System.out.println("The branch with specified id does not exist");
		}
		Branch fbranch1 = em.find(Branch.class, 3);
		if(fbranch1!=null) {
			System.out.println("Branch belongs to : "+fbranch1.getHospital());
			System.out.println("Branch id is : "+fbranch1.getId());
			System.out.println("Branch name is : "+fbranch1.getCity());
			System.out.println("Branch located at : "+fbranch1.getLocation());
			System.out.println("Contact branch at : "+fbranch1.getPhone());
		}
		else {
			System.out.println("The branch with specified id does not exist");
		}
	}
}
