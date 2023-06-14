package com.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Models.Item;
import com.dao.CartDao;
import com.dao.CartItemDao;

@Service
public class CartService {
	@Autowired
	private CartDao cdao;

	@Autowired
	private CartItemDao cartItemDao;

	public int createProduct(Item pro) {
		return this.cdao.saveProduct(pro);
	}

	public List<Item> getCartProducts() {
		return this.cdao.getCartProducts();
	}

	public void removeCartItem(Item item) {
		cartItemDao.removeCartItem(item);
	}

	public Item getCartItemByProductId(int productId) {
		return cartItemDao.getCartItemByProductId(productId);

	}
}
