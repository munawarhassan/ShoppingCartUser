package com.ibm.demo.shoppingcartuser.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.demo.shoppingcartuser.model.User;
import com.ibm.demo.shoppingcartuser.service.ShoppingCartUserService;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;

@Log
@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class ShoppingCartUserController {
	
	private final ShoppingCartUserService userservice;
	
	@RequestMapping(path = "/default", method = RequestMethod.GET)
	public String getDefaultMessage() {		
		
		return	"Hello , I am ready ";
	}
	
	
	@RequestMapping(path = "/adduser", method = RequestMethod.POST)
	public ResponseEntity<?> adduser(@RequestBody User user) {
		log.info("*Inside add Promo**");
		return userservice.adduser(user);
	}

	@RequestMapping(path = "/updateuser", method = RequestMethod.PUT)
	public ResponseEntity<?> updateuser(@RequestBody User user) {
		log.info("*Inside update Product**");
		return userservice.updateuser(user);
	}
	
	@RequestMapping(path = "/deleteuser", method = RequestMethod.PUT)
	public ResponseEntity<?> deleteuser(@RequestBody User user) {
		log.info("*Inside delete Product**");
		return userservice.deleteuser(user);
	}
}
