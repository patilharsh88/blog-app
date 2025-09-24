package com.ProjectA.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;

import com.ProjectA.entity.AppUser;
import com.ProjectA.repo.UserRepository;
import com.ProjectA.utility.UserUtil;

@Service
public class UserService {

	@Autowired
	UserRepository ur;
	
	
	public UserUtil<AppUser> addUser(AppUser u) {

	    if (u == null) {
	        throw new IllegalArgumentException("User cannot be null");
	    }

	    ur.save(u);

	    UserUtil<AppUser> ap = new UserUtil<>();
	    ap.setData(u);
	    ap.setMessage("Added Successfully");
	    ap.setStatusCode(HttpStatus.CREATED.value());
	    ap.setDate(LocalDateTime.now());

	    return ap;
	}


	public boolean authenticateUser(String email, String password) {
        AppUser user = ur.findByEmail(email);
        if (user != null) {
            return user.getPassword().equals(password);
        }
        return false;
    }

	
//	public void addUser(AppUser u) {
//		ur.save(u);
//		
//	}
	
}
