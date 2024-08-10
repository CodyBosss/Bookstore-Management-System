package com.bookstore.repository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.bookstore.domain.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{
	
	Book findById(int id);

	List<Book> findByCategory(String category);

	List<Book> findByTitleContaining(String title);

}
