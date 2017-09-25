package com.nksthay.springboot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nksthay.springboot.web.service.LoginService;

@Controller
public class LoginController {
	//Initialize a service helper for login
	@Autowired
	LoginService service;
	
	//Shows login page
    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String showLoginPage(ModelMap model){
    	return "login";
    }
    
    //After submit is pressed
    @RequestMapping(value="/login", method = RequestMethod.POST)
    public String showWelcomePage(ModelMap model, @RequestParam String name, @RequestParam String password){

    	//Check if user credentials are valid
        boolean isValidUser = service.validateUser(name, password);

        //Shows error message if credentials aren't valid
        if (!isValidUser) {
        	model.put("errorMessage", "Invalid Credentials");
        	return "login";
        }

        //Sends name to page document
        model.put("name", name);
        //model.put("password", password);

        //Shows welcome page
        return "welcome";
    }
}
