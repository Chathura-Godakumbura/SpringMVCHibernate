package com.journaldev.spring.service;

import java.util.List;

import com.journaldev.spring.model.Books;

public interface BookService {

	public void addBook(Books b);
	public List<Books> listBooks();
	public Books getBooksById(int id);
	
	
	
}
