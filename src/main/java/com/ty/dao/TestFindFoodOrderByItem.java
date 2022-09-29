package com.ty.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.dto.FoodOrder;
import com.ty.dto.Item;

public class TestFindFoodOrderByItem {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		Item i = em.find(Item.class, 6);
		if(i!=null) {
			System.out.println("-----Food Order-----");
			System.out.println("Food Name is : "+i.getName());
			System.out.println("Food id is : "+i.getId());
			System.out.println("Food price is : "+i.getCost());
			System.out.println("Quantity is : "+i.getQuantity());
		}
		else {
			System.out.println("Food order not found");
		}
		FoodOrder f = i.getFoodOrder();
		if(f!=null) {
			System.out.println("Food id is : "+f.getId());
			System.out.println("Order placed by : "+f.getPlacedBy());
			System.out.println("Order status : "+f.getStatus());
		}
		else {
			System.out.println("food order not found with respect to specified item");
		}
	}
}