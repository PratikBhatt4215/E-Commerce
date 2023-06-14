package com.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Models.AddProduct;
import com.Models.Item;
import com.Service.CartService;
import com.dao.ProductDao;

@Controller
public class CartController {

	@Autowired
	private CartService cartService;

	@Autowired
	private ProductDao productDao;


	@RequestMapping("/cartHome")
	private String viewCart(HttpSession sessions, Model m) {
		List<Item> itemList = cartService.getCartProducts();
		Iterator<Item> itr = itemList.iterator();
		ArrayList<AddProduct> pList = new ArrayList<AddProduct>();
		while (itr.hasNext()) {
			Item cp = itr.next();
			int pId = cp.getProductid();
			AddProduct product = productDao.getProductById(pId);
			pList.add(product);
		}
		double totalPrice = 0;
		for (AddProduct a : pList) {

			totalPrice += a.getPprice();
		}
		double shipCharge = 40;

		m.addAttribute("total", totalPrice);
		m.addAttribute("Ship", shipCharge);
		m.addAttribute("qan",itemList);
		
		double overall = totalPrice + shipCharge;
		m.addAttribute("grand", overall);
		m.addAttribute("getCart", pList);
		return "cartHome";
	}

	@RequestMapping("/buy/{productId}")
	public String showCart(@PathVariable int productId, Model m) {

		Item cartProduct = new Item();

		cartProduct.setProductid(productId);
		List<Item> myCartList = cartService.getCartProducts();
		for (Item cart1 : myCartList) {
			if (cart1.getProductid() == productId) {
				return "redirect:/cartHome";

			}
		}
		this.cartService.createProduct(cartProduct);

		return "redirect:/cartHome";
	}
	@RequestMapping("/delete/{productId}")
	public String deleteCart(@PathVariable int productId, Model m)   {
		Item item= cartService.getCartItemByProductId(productId);
		cartService.removeCartItem(item);
		
		return "redirect:/cartHome";
	}

}