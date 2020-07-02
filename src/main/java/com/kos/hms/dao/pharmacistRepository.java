package com.kos.hms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.kos.hms.models.Diagnostic;
import com.kos.hms.models.Pharmacist;

@Repository
public interface pharmacistRepository extends JpaRepository<Pharmacist, Integer>{

	@Query(value="select * form Pharmacist where patientId = ?1",nativeQuery=true)
	List<Pharmacist> findByPatientId(int id);
	
}
