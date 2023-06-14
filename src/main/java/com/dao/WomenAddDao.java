package com.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.Models.WomenProduct;
@Repository
public class WomenAddDao {
	
	@Autowired
	private HibernateTemplate hibernateTempate;
	@Transactional
	public int saveProduct(WomenProduct pro) {
		
		int i =(Integer)this.hibernateTempate.save(pro);
		return i;
	}
}
