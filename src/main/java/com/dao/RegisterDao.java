package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.Models.Register;

@Repository
public class RegisterDao {
	@Autowired
	private HibernateTemplate hibernateTempate;

	@Transactional
	public int saveUser(Register reg) {

		int i = (Integer) this.hibernateTempate.save(reg);
		return i;
	}

	public List<Register> getAllUserData() {
		return this.hibernateTempate.loadAll(Register.class);
	}

}
