package com.ProjectA.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProjectA.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer>{

}
