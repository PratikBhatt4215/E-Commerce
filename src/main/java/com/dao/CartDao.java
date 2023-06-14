package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.Models.Item;
@Repository
@Transactional
public class CartDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
	private HibernateTemplate hibernateTempate;
	@Transactional
	public int saveProduct(Item pro) {
		
		return (Integer)this.hibernateTempate.save(pro);
		
	}

	public List<Item> getCartProducts() {
		return this.hibernateTempate.loadAll(Item.class);
	}
	
	public List<Item> getAllProduct() {
		Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Item");
        List<Item> productList = query.list();

        return productList;
	}
}
