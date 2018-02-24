package net.mihai.onlineshopping.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import net.mihai.shoppingbackend.dao.CategoryDAO;
import net.mihai.shoppingbackend.dao.ProductDAO;
import net.mihai.shoppingbackend.dto.Category;
import net.mihai.shoppingbackend.dto.Product;
@Controller
@RequestMapping("/manage")
public class ManagementController {
	
	
	@Autowired
	private ProductDAO productDAO;
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	
	private static final Logger loger = LoggerFactory.getLogger(ManagementController.class);
	
	@RequestMapping(value="/products", method = RequestMethod.GET)
	public ModelAndView showManageProducts(@RequestParam(name="operation", required=false) String success) {		

		ModelAndView mv = new ModelAndView("page");	
		mv.addObject("title","Product Management");		
		mv.addObject("userClickManageProduct",true);
		Product newProduct = new Product();
		//setting fields

		newProduct.setSupplierId(1);
		newProduct.setActive(true);
		mv.addObject("product",newProduct);

		if(success != null) {
			if(success.equals("product")){
				mv.addObject("message", "Product submitted successfully!");
			}	
			else if (success.equals("category")) {
				mv.addObject("message", "Category submitted successfully!");
			}
		}
		return mv;
	}
	
	@RequestMapping(value = "/products", method = RequestMethod.POST)
		public String handlerSummisionProduct(@Valid  @ModelAttribute("product") Product mProduct, BindingResult results, Model model) {
			
		if(results.hasErrors()) {
			model.addAttribute("message", "Validation fails for adding the product!");
			model.addAttribute("title","Manage Products");
			model.addAttribute("userClickManageProduct",true);
			return "page";
		}	
		loger.info(mProduct.toString());
		
			productDAO.add(mProduct);
			
			return "redirect:/manage/products?operation=product";
		}
	
	 
	@ModelAttribute("categories")
	public List<Category> getCategories()
	{
		return categoryDAO.list();
	}

}
