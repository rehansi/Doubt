package com.gl.springSecurity.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.springSecurity.entity.User;

@Repository
public interface jparepo extends JpaRepository<User, Integer>   {
 
	Optional<User> findByUserName(String username);
}
