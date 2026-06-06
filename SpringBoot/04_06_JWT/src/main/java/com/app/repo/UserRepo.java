package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

	User findByUsername(String username);

}
