package com.cg.healthassist.doctorpatient.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.healthassist.doctorpatient.model.Patient;
/** 
 * This is an interface which defines CRUD methods for patient JPA repository
 * @author perumallu
 *
 * 
 */
@Repository
public interface PatientRepository extends  JpaRepository<Patient,Integer>{

}
