package com.hdb.web.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hdb.web.Validator.UserValidator;
import com.hdb.web.dto.User;
import com.hdb.web.service.UserDaoService;

@Controller
public class UserController {
	@Autowired
	private UserValidator userValidator;
	
	@InitBinder
	 protected void initBinder(WebDataBinder binder) {
	      binder.addValidators(userValidator);
	   }
	
	  @GetMapping("/")
	   public String userForm(Locale locale,Model model) {
	      model.addAttribute("user", new User());
	      System.out.println("getmapping");
	      return "userForm";
	   }

	   /*
	    * Save user object
	    */
	  @Autowired
	  UserDaoService userdao;
	  
	   @PostMapping("/saveUser")
	   public ModelAndView saveUser(@ModelAttribute("user") @Validated User user, BindingResult result,
	         Model model) {
System.out.println("post mapping");
	      if (result.hasErrors()) {

			   ModelAndView modelAndView=new ModelAndView("userForm");
	         return modelAndView;
	         
	      }
	      model.addAttribute("h", "my name is hdb");
	      System.out.println(user);
	      userdao.saveUser(user);
	      ModelAndView modelAndView=new ModelAndView("success");
	      modelAndView.addObject("message"," added.....");
	      return modelAndView;
	   }
	
	
	
	
}

