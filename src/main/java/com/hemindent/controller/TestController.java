package com.hemindent.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class TestController {

	 @GetMapping("/test")
	    ResponseEntity<String> sayHello() {
	        return ResponseEntity.ok("test");
	    }
	 
	 @GetMapping("/error")
	    ResponseEntity<String> sayError() {
	        return ResponseEntity.ok("error");
	    }


}
