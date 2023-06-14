package com.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Models.AddProduct;
import com.dao.ProductDao;

@Repository
@Transactional
public class ProductDaoImpl implements ProductDao{

	@Autowired
	private SessionFactory sessionFactory;
	public void addProduct(AddProduct adpro) {
		Session se = sessionFactory.getCurrentSession();
		se.saveOrUpdate(adpro);
		se.flush();
		
	}

	public AddProduct getProductById(int id) {

		Session se = sessionFactory.getCurrentSession();
		AddProduct pro = (AddProduct)se.get(AddProduct.class, id);
		return pro;
	}
	public List<AddProduct> getAllProduct() {
		Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from AddProduct");
        List<AddProduct> productList = query.list();

        return productList;
	}

	public void deleteProduct(int id) {
		Session se = sessionFactory.getCurrentSession();
		se.delete(getProductById(id));
		se.flush();
		
	}



}
