package com.ProjectA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ProjectA.entity.Comment;
import com.ProjectA.service.CommentService;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class CommentController {

	@Autowired
	CommentService cs;
	
	@PostMapping("/AddComment")
	public void addComment(@RequestBody Comment c) {
		
		cs.addComment(c);
	}
	
}
