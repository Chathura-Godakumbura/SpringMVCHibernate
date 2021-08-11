package com.journaldev.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.journaldev.spring.model.Books;

@Repository
public class BookDAOImpl implements BookDAO {

	private static final Logger logger = LoggerFactory.getLogger(BookDAOImpl.class);

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	
	
	@Override
	public void addBook(Books b) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(b);
		logger.info("book saved successfully, Book Details="+b);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Books> listBooks() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Books> bookList = session.createQuery("from Books").list();
		for (Books b : bookList) {
			logger.info("Book List::" + b);
		}
		return bookList;
	}
	
	@Override
	public Books getBooksById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Books b = (Books) session.load(Books.class, new Integer(id));
		logger.info("Book loaded successfully, Book details="+b);
		return b;
	}
}