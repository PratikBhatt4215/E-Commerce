package com.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Models.WomenProduct;
import com.dao.WomenAddDao;

@Service
public class WomenService {
	@Autowired
	private WomenAddDao pdao;
	
	public int  createProduct(WomenProduct pro) {
		return this.pdao.saveProduct(pro);
	}
}
