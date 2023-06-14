package com.dao;

import java.util.List;

import com.Models.AddProduct;

public interface ProductDao {

	void addProduct(AddProduct adpro);
	AddProduct getProductById(int id);
	List<AddProduct> getAllProduct();
	void deleteProduct(int id);
}
