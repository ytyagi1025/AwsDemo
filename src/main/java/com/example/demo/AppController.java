package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@GetMapping("/home")
	public ResponseEntity<?> getHome(){
		return new ResponseEntity("Welcome Home",HttpStatus.OK);
	}

}
