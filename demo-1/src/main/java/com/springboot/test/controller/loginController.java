package com.springboot.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class loginController {
	
	@RequestMapping("/login.do")
    public String root_test() throws Exception{
		
        return "login";
    }


}
