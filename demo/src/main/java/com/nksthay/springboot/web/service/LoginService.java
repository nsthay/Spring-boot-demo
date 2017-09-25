package com.nksthay.springboot.web.service;

import org.springframework.stereotype.Service;

//Helper class for Login controller
@Service
public class LoginService {
	//Validates user credentials
    public boolean validateUser(String userid, String password) {
        return userid.equalsIgnoreCase(userid) && password.equalsIgnoreCase("pass");
    }
}
