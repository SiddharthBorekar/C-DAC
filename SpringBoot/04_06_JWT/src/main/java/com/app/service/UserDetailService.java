package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.app.entity.User;
import com.app.repo.UserRepo;

@Service
public class UserDetailService implements UserDetailsService {
	@Autowired
	private UserRepo repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = repo.findByUsername(username);
		System.out.println("User : "+user);
		if(user==null) {
			System.out.println("User 404");
			throw new UsernameNotFoundException("User 404");
		}
		return new UserPrincipal(user);
	}

}
