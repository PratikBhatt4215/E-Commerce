package com.dao;

import java.util.List;

import com.Models.WomenProduct;

public interface WomenDao {
	void addWomenProduct(WomenProduct adpro);
	List<WomenProduct> getAllWomenProduct();
	WomenProduct getProductById(int id);
	void deleteProduct(int id);
}
