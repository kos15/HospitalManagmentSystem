package com.kos.hms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kos.hms.models.MedicineInventry;
@Repository
public interface medicineInventryRepository extends JpaRepository<MedicineInventry, Integer>{

	MedicineInventry findByMedicineName(String medicineName);
	
	Boolean existsByMedicineName(String medicineName);
	
}
