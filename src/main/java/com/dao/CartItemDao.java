package com.dao;

import com.Models.Item;

public interface CartItemDao {
	void removeCartItem(Item item);
	Item getCartItemByProductId(int productId);
}
