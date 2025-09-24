package com.ProjectA.repo;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ProjectA.entity.AppUser;

@Repository
public interface UserRepository extends JpaRepository<AppUser, Integer> {

	
	
	AppUser save(AppUser u);

	AppUser findByEmail(String email);

	
	
}