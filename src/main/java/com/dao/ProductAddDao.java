package com.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.Models.AddProduct;

@Repository
public class ProductAddDao {
	@Autowired
	private HibernateTemplate hibernateTempate;
	@Transactional
	public int saveProduct(AddProduct pro) {
		
		int i =(Integer)this.hibernateTempate.save(pro);
		return i;
	}
}
