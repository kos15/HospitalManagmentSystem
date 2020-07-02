package com.kos.hms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kos.hms.models.Test;
@Repository
public interface testRepository extends JpaRepository<Test, Integer>{

	Boolean existsByTestName(String testName);
	
	Test findByTestName(String testName);
	
}
