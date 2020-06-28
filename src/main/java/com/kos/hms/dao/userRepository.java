package com.kos.hms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kos.hms.models.User;

@Repository
public interface userRepository extends JpaRepository<User, Integer>{
	
	User findByUsername(String username);

}
