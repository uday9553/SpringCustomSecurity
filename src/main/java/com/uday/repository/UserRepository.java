package com.uday.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uday.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}
