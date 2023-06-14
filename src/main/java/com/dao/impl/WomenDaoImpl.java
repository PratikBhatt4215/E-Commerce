package com.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Models.WomenProduct;
import com.dao.WomenDao;
@Repository
@Transactional
public class WomenDaoImpl implements WomenDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	public List<WomenProduct> getAllWomenProduct() {
		Session session = sessionFactory.getCurrentSession();
       
		Query q = session.createQuery("from WomenProduct");
		List<WomenProduct> womensProduct  = q.list();
		return womensProduct;
		
	}
	public WomenProduct getProductById(int id) {
		
		Session se = sessionFactory.getCurrentSession();
		WomenProduct pro = (WomenProduct)se.get(WomenProduct.class, id);
		return pro;
	}
	public void addWomenProduct(WomenProduct adpro) {
		Session se = sessionFactory.getCurrentSession();
		se.saveOrUpdate(adpro);
		se.flush();
	}
	public void deleteProduct(int id) {
		Session se = sessionFactory.getCurrentSession();
		se.delete(getProductById(id));
		se.flush();
	}


}
