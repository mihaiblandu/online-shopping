package net.mihai.onlineshopping.controller;

import javax.ws.rs.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value = { "/", "/home", "/index", "BasicParamRequest" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", "Wellcome to Spring MVC");
		return mv;

	}

	@RequestMapping(value = { "/test" })
	public ModelAndView index1(@RequestParam(value = "greeting", required = false) String greeting) {
		ModelAndView mv = new ModelAndView("page");

		mv.addObject("greeting", greeting);

		return mv;

	}

	@RequestMapping(value = { "/test/{greeting}" })
	public ModelAndView index2(@PathParam("greeting") String greeting) {

		if (greeting == null) {
			greeting = "Hello there";
		}
		ModelAndView mv = new ModelAndView("page");

		mv.addObject("greeting", greeting);

		return mv;

	}

}
