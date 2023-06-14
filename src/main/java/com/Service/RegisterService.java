package com.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Models.Register;
import com.dao.RegisterDao;

@Service
public class RegisterService {
	@Autowired
	private RegisterDao regdao;

	public int createUser(Register reg) {
		return this.regdao.saveUser(reg);
	}

	public List<Register> getAllUserData() {

		return regdao.getAllUserData();

	}
}
