package com.example.springdemo.SpringHelloWorld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloService {
        
	    @RequestMapping("/")
		public String index() {
			return ("Hello World");
			
		}
}
