package com.demo.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
/*This is commit trigger*/

@Controller
@RequestMapping("/greet")
public class MainController {
	
	@RequestMapping(value="/hello/{name}/{id}")
	public ModelAndView getMessage(@PathVariable("name") String name,@PathVariable("id") String id){
		ModelAndView modelAndView = new  ModelAndView("hello");
		modelAndView.addObject("name",name);
		modelAndView.addObject("id",id);
		return modelAndView;
	}
	
	@RequestMapping("/test")
	public ModelAndView getTestPage(){
		ModelAndView modelAndView = new  ModelAndView("test");
		return modelAndView;
	}

}
