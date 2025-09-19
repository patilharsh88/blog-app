package com.ProjectA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ProjectA.entity.AppUser;
import com.ProjectA.service.UserService;
import com.ProjectA.utility.UserUtil;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
class UserController {

	@Autowired
	UserService us;
		
	@CrossOrigin(origins = "http://localhost:5173")
	 @PostMapping("/add")
    public ResponseEntity<UserUtil<AppUser>> addUser(@RequestBody AppUser user) {
        UserUtil<AppUser> result = us.addUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }
	
}
