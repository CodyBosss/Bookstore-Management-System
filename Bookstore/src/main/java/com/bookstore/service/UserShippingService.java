package com.bookstore.service;

import com.bookstore.domain.UserShipping;

public interface UserShippingService {
	
	UserShipping findById(int id);
	
	void removeById(int id);
}
