package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    

	
	@Autowired
	MessageConfigProperties messageProperties;
	
    @RequestMapping("/hello")
    public String index() {
        
    	String greetingsMessage = messageProperties.getGreetings();
    	
    	System.out.println("Inside index() method, returning :"+greetingsMessage);
    	
    	//return "Greetings from Spring Boot!";
        return greetingsMessage;
    }
    
}
