package com.journaldev.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.journaldev.spring.dao.BookDAO;
import com.journaldev.spring.model.Books;

@Service
public class BookServiceImpl implements BookService{
	
	private BookDAO bookDAO;
	
	
	public void setBookDAO(BookDAO bookDAO) {
		this.bookDAO = bookDAO;
	}

	@Override
	@Transactional
	public void addBook(Books b) {
		this.bookDAO.addBook(b);
	}
	
	@Override
	@Transactional
	public List<Books> listBooks() {
		return this.bookDAO.listBooks();
	}

	@Override
	@Transactional
	public Books getBooksById(int id) {   //the function call to getBookById method in bookDAO class 
		return this.bookDAO.getBooksById(id);
	}	
	

}
