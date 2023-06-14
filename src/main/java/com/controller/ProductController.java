package com.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Models.AddProduct;
import com.Models.WomenProduct;
import com.Service.ProductService;
import com.dao.ProductDao;
import com.dao.WomenDao;

@Controller
public class ProductController {
	@Autowired
	private ProductService ps;
	@Autowired
	private ProductDao productDao;
	
	
	@RequestMapping(path="/productList")
	public String menProducts() {
		System.out.println("mens product called");
		return "menProducts";
		
	}
	
	
	
	
	@RequestMapping("/viewProduct/{productId}")
	public String viewProduct(@PathVariable int productId,Model m) throws IOException {
		
		AddProduct a = productDao.getProductById(productId);
		m.addAttribute("getproduct",a);
		return "viewProduct";
	}
	
	@RequestMapping("/productList1")
	public String getProducts(Model m1) {
		List<AddProduct> pl = productDao.getAllProduct();
		m1.addAttribute("products",pl);
		return "menProducts";
	}
	
	
	
	
}
