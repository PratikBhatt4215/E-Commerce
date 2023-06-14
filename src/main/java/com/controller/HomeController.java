package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.Models.AddProduct;
import com.Models.WomenProduct;
import com.Service.ProductService;
import com.Service.WomenService;
import com.dao.ProductDao;


@Controller
public class HomeController {
	@Autowired
	private ProductDao productDao;
	@RequestMapping("/")
	public String homeview() {
		
		return "index";
	}
	@RequestMapping("/admin")
	public String adminpage() {
		
		return "admin";
		
	}
	
	@RequestMapping("/doadminregister")
	public String registerAdmin(@RequestParam("aemail") String adminemail, @RequestParam("apassword") String apassword,Model m) {
		
		if(adminemail.equals("admin@gamil.com") && apassword.equals("admin123")) {
			System.out.println("adminLogined called");
			m.addAttribute("msg1", "AdminLogin Successfully");
			List<AddProduct> products = productDao.getAllProduct();
			m.addAttribute("products",products);
			return "productInventory";
		}else {
			m.addAttribute("failedAdmin", "Invalid email passowrd , Try again");
			return "admin";
		}
		
		
	}
	@Autowired
	private ProductService ps;
	
	@RequestMapping("/addProduct")
	public String addProduct() {
		
		
		return "addProduct";
	}
	@RequestMapping("/backtohome")
	
	private String backToProducts() {
		
		return "index";
	}
	
	
	@RequestMapping(path = "/addproduct",method = RequestMethod.POST)
	public String addProduct(@ModelAttribute AddProduct addp, Model m1) {
		m1.addAttribute("msg","Product added to database");
		m1.addAttribute("product",addp);
		int id1 = this.ps.createProduct(addp);
		return "productAddSuccess";
	}

}
