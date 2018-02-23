package net.mihai.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import net.mihai.shoppingbackend.dao.CategoryDAO;
import net.mihai.shoppingbackend.dao.ProductDAO;
@Controller
@RequestMapping("/manage")
public class ManagementController {
	
	
	@Autowired
	private ProductDAO productDAO;
	
	@Autowired
	private CategoryDAO categoryDAO;		
	
	@RequestMapping(value="/products", method = RequestMethod.GET)
	public ModelAndView showManageProducts() {		

		ModelAndView mv = new ModelAndView("page");	
		mv.addObject("title","Product Management");		
		mv.addObject("userClickManageProduct",true);
		return mv;
	}

}
