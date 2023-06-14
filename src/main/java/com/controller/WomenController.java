package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Models.WomenProduct;
import com.Service.WomenService;
import com.dao.WomenDao;

public class WomenController {
	
	@Autowired
	private WomenService ws;
	@Autowired
	private WomenDao womenDao ;
	
	@RequestMapping("/womenProduct")
	public String getwomenProducts(Model m2) {
		
		List<WomenProduct> w = womenDao.getAllWomenProduct();
		m2.addAttribute("womenPro",w);
		return "womensProduct";
	}
	
	@RequestMapping("/viewWomen/{womenId}")
	public String viewWomen(@PathVariable int womenId,Model m) {
		WomenProduct w1 = womenDao.getProductById(womenId);
		m.addAttribute("getwomen",w1);
		return "viewWomen";
	}
	@RequestMapping("/addwomen")
	public String addWomenProduct() {
		return "addwomen";
	}
	
	@RequestMapping(path = "/doaddwomen",method = RequestMethod.POST)
	public String addWomenProduct(@ModelAttribute WomenProduct addp, Model m1) {
		m1.addAttribute("msg","Product added to database");
		m1.addAttribute("product",addp);
		int id1 = this.ws.createProduct(addp);
		return "addwomen";
	}
}
