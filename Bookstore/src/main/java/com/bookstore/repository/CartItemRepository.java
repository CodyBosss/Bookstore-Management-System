package com.bookstore.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.bookstore.domain.CartItem;
import com.bookstore.domain.Order;
import com.bookstore.domain.ShoppingCart;

@Transactional
public interface CartItemRepository extends CrudRepository<CartItem, Integer> {
	
	List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);
	
	CartItem findById(int id);
	
	List<CartItem> findByOrder(Order order);
}
