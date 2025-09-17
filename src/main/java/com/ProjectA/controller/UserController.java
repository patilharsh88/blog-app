package com.ProjectA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProjectA.entity.AppUser;
import com.ProjectA.service.UserService;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
class UserController {

	@Autowired
	UserService us;
	
	
	@CrossOrigin(origins = "http://localhost:5173")
	@PostMapping("/saveUser")
	public void addUser(@RequestBody AppUser u) {
		
		us.addUser(u);
	}
	
}
