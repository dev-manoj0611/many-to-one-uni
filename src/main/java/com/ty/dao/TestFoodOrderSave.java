package com.ty.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.FoodOrder;
import com.ty.dto.Item;

public class TestFoodOrderSave {

	public static void main(String[] args) {
		FoodOrder fo = new FoodOrder();
		fo.setPlacedBy("deepu");
		fo.setStatus("served");
		Item i1 = new Item();
		i1.setName("rice bowl");
		i1.setQuantity(1);
		i1.setCost(100);
		i1.setFoodOrder(fo);
		Item i2 = new Item();
		i2.setName("pizza");
		i2.setQuantity(2);
		i2.setCost(300);
		i2.setFoodOrder(fo);
		Item i3 = new Item();
		i3.setName("fried rice");
		i3.setQuantity(1);
		i3.setCost(80);
		i3.setFoodOrder(fo);
		FoodOrder fo1 = new FoodOrder();
		fo1.setPlacedBy("divya");
		fo1.setStatus("served");
		Item i4 = new Item();
		i4.setName("fried rice");
		i4.setQuantity(1);
		i4.setCost(80);
		i4.setFoodOrder(fo1);
		Item i5 = new Item();
		i5.setName("maggi");
		i5.setQuantity(1);
		i5.setCost(100);
		i5.setFoodOrder(fo1);
		Item i6 = new Item();
		i6.setName("pizza");
		i6.setQuantity(2);
		i6.setCost(100);
		i6.setFoodOrder(fo1);
		FoodOrder fo2 = new FoodOrder();
		fo2.setPlacedBy("shiva");
		fo2.setStatus("preparing");
		Item i7 = new Item();
		i7.setName("green tea");
		i7.setQuantity(1);
		i7.setCost(20);
		i7.setFoodOrder(fo2);
		Item i8 = new Item();
		i8.setName("burger");
		i8.setQuantity(1);
		i8.setCost(66);
		i8.setFoodOrder(fo2);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(fo);
		em.persist(fo1);
		em.persist(fo2);
		em.persist(i1);
		em.persist(i2);
		em.persist(i3);
		em.persist(i4);
		em.persist(i6);
		em.persist(i7);
		em.persist(i8);
		et.commit();
	}
}