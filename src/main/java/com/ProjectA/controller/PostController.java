package com.ProjectA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ProjectA.entity.Post;
import com.ProjectA.service.PostService;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class PostController {

	@Autowired
	PostService ps;
	
	@PostMapping("/DoPost")
	public void post(@RequestBody Post p) {
		ps.post(p);		
	}
	
}