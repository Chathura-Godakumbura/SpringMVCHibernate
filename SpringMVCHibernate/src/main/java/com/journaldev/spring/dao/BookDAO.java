package com.journaldev.spring.dao;

import java.util.List;

import com.journaldev.spring.model.Books;

public interface BookDAO {
	public void addBook(Books b);
	public List<Books> listBooks();
	public Books getBooksById(int id);	
}
