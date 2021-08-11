package com.journaldev.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.journaldev.spring.model.Advert;
import com.journaldev.spring.model.Books;
import com.journaldev.spring.model.Person;
import com.journaldev.spring.service.AdvertService;
import com.journaldev.spring.service.BookService;


@Controller
public class OrderController {
	
private static final Logger logger = LoggerFactory.getLogger(OrderController.class);
private BookService bookService;

private AdvertService advertservice;
	
	@Autowired(required = true)
	@Qualifier(value="BookService")
	public void setBookService(BookService bs) {
		this.bookService = bs;
	}

	@RequestMapping(value = "/order", method = RequestMethod.GET)
	public String listBooks(Model model) {
		model.addAttribute("books", new Books());
		model.addAttribute("listBooks", this.bookService.listBooks());
		return "Book";
	}
	
	@RequestMapping(value= "/book/add", method = RequestMethod.POST)
	public String addBook(@ModelAttribute("books") Books b){
		
		if(b.getBookid()== 0){
			//new person, add it
			this.bookService.addBook(b);
		}else{
			//existing person, call update
		}
		
		return "redirect:/";
		
	}

	
	@RequestMapping(value="/advert", method=RequestMethod.GET)
	public String viewadvert(Model model, Advert advert)
	{
		logger.info("advert() start------------------>:");
		model.addAttribute("advert", advert);
		model.addAttribute("listadvert", this.advertservice.listAdvert()) ;
		logger.info("advert() End------------------>:");
		
		return "testresult";
	}

}
