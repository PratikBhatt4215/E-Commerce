package com.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Models.AddProduct;
import com.dao.ProductAddDao;

@Service
public class ProductService {

	@Autowired
	private ProductAddDao pdao;
	
	public int  createProduct(AddProduct pro) {
		return this.pdao.saveProduct(pro);
	}
}

