package com.ProjectA.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProjectA.entity.Post;


public interface PostRepository extends JpaRepository<Post, Integer> {


	
}
