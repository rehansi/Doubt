package com.gl.springSecurity.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.gl.springSecurity.entity.MyUserDetails;
import com.gl.springSecurity.entity.User;
import com.gl.springSecurity.repo.jparepo;


@Service
public class MyUserDetailService implements UserDetailsService {
      
	@Autowired
	jparepo repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		//with this i have take the user instance from the reposioty convert it to 
		//myUserDetail instance  
//		Optional<User> user = repo.findByUserName(username);
//		user.orElseThrow(() -> new UsernameNotFoundException("Invalid"));
//		return user.map(MyUserDetails :: new ).get();
		
		return repo.findByUserName(username).map(MyUserDetails::new)
				.orElseThrow(() -> new UsernameNotFoundException("Invalid user name passed"));

	}
}
