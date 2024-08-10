package com.adminportal.service;

import java.util.List;

import com.adminportal.domain.Book;

public interface BookService {
	
	Book save(Book book);

	List<Book> findAll();
	
	Book findById(int id);

//	Book findById(Long id);
	
	void removeOne(int id);
}
