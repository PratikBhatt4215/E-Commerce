package com.dao.impl;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Models.Item;
import com.dao.CartItemDao;
@Repository
@Transactional
public class CartItemImpl implements CartItemDao {
	@Autowired
	private SessionFactory sessionFactory;

	public void removeCartItem(Item item) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(item);
		session.flush();

	}

	public Item getCartItemByProductId(int productId) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Item where productid ="+productId);
		session.flush();

		return (Item) query.uniqueResult();
	}

}
