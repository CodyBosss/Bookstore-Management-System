package com.bookstore.service;

import com.bookstore.domain.UserPayment;

public interface UserPaymentService {
	UserPayment findById(int id);
	
	void removeById(int id);
}
