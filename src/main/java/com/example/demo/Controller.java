package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	private Jpa jpa;
	
	@PostMapping(value="/addbooks",consumes = "application/json")
	public ResponseEntity<String> addbook(@RequestBody Product product){
		
		Product save = jpa.save(product);
		
		return new ResponseEntity<>("book added",HttpStatus.CREATED);
		
	}
	
	@GetMapping(value="/getbooks",produces = ("application/json"))
	public ResponseEntity<List<Product>> getbooks(){
		
		List<Product> findAll = jpa.findAll();
		
		return new ResponseEntity<>(findAll,HttpStatus.OK);
	}
}