package com.bookstore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.domain.UserShipping;
import com.bookstore.repository.UserShippingRepository;
import com.bookstore.service.UserShippingService;

@Service
public class UserShippingServiceImpl  implements UserShippingService{
	
	@Autowired
	UserShippingRepository userShippingRepository;

	@Override
	public UserShipping findById(int id) {
		return userShippingRepository.findById(id);
	}

	@Override
	public void removeById(int id) {
		userShippingRepository.deleteById(id);
		
	}
	


}
