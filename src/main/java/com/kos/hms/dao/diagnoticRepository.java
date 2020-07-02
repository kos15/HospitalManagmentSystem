package com.kos.hms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.kos.hms.models.Diagnostic;

@Repository
public interface diagnoticRepository extends JpaRepository<Diagnostic, Integer>{
	
	@Query(value="select * form Diagnostic where patientId = ?1",nativeQuery=true)
	List<Diagnostic> findByPatientId(int id);
	
}
