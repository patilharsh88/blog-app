package com.ProjectA.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProjectA.entity.Comment;
import com.ProjectA.repo.CommentRepository;

@Service
public class CommentService {

	@Autowired
	CommentRepository cr;
	
	public void addComment(Comment c) {
		cr.save(c);
	}

}
