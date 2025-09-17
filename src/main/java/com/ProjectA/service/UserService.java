package com.ProjectA.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProjectA.entity.AppUser;
import com.ProjectA.repo.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository ur;
	
	public void addUser(AppUser u) {
		ur.save(u);
		
	}
	
}
