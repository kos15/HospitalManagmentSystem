package com.kos.hms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kos.hms.models.Patients;
@Repository
public interface patientRepository extends JpaRepository<Patients, Integer>{

	/*
	 * @Override List<Patients> findAll();
	 */
	Patients findByPatientId(int patientId);
	
	Boolean existsByPatientSSNID(int patientSSNID);
}
