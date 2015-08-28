package com.demo.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Employee;

@Controller
public class LoginController {
	
	/*@RequestMapping(value="/success")
	public ModelAndView getLoginForm(@RequestParam(value="firstname",defaultValue="Test") String firstname, 
			@RequestParam("lastname") String lastname ){
		ModelAndView modelview = new ModelAndView("success");
		modelview.addObject("firstname", firstname);
		modelview.addObject("lastname", lastname);
		return modelview;		
		
	}*/
	
	@RequestMapping(value="/success")
	public ModelAndView getLoginForm(@ModelAttribute("employee") Employee employee, 
			BindingResult result ){
		
		if(result.hasErrors()){
			ModelAndView modelview = new ModelAndView("login");		
			return modelview;
		}
		ModelAndView modelview = new ModelAndView("success");		
		return modelview;		
		
	}
	
	@RequestMapping(value="/login")
	public ModelAndView  getLoginForm(){	
		return new ModelAndView("login");		
		
	}
	

}
