package com.journaldev.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity bean with JPA annotations
 * Hibernate provides JPA implementation
 * @author pankaj
 *
 */
@Entity
@Table(name="BOOKS")
public class Books {

	@Id
	@Column(name="bookid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int bookid;
	
	private String bookname;

	private String Auther;

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuther() {
		return Auther;
	}

	public void setAuther(String auther) {
		Auther = auther;
	}

	@Override
	public String toString() {
		return "Books [bookid=" + bookid + ", bookname=" + bookname + ", Auther=" + Auther + "]";
	}

	
	
}
