package com.ProjectA.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.ProjectA.entity.Post;
import com.ProjectA.repo.PostRepository;

@Service
public class PostService {

	@Autowired
	PostRepository pr;
	
	public void post(Post p) {
		pr.save(p);
	}
	
}
