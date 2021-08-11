package com.journaldev.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
import com.journaldev.spring.service.CartItemService;
import com.sun.org.slf4j.internal.Logger;

@Controller 
public class CartController {
	
	private CartItemService cartitemservice;
	


	@RequestMapping(value = "/cart", method = RequestMethod.GET)
	public String listCart(Model model) {
//		model.addAttribute("cartitem", this.cartitemservice.listCartItem());
		//logger.info("executeAction()---------------------------->");
		return "Cart";
	}
	
}
