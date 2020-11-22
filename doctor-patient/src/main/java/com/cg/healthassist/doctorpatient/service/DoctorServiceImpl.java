package com.cg.healthassist.doctorpatient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.healthassist.doctorpatient.exceptions.PatientNotFoundException;
import com.cg.healthassist.doctorpatient.model.Patient;
import com.cg.healthassist.doctorpatient.repository.PatientRepository;

/**
 * This DoctorServiceImpl class provides access to JPA methods to add the prescription
 *    and view details of the patient
 *    
 * @author perumallu
 *
 * 
 */

@Service
@Transactional
public class DoctorServiceImpl implements DoctorService {
	@Autowired
	private PatientRepository patientRepository;
	/**
	 * This method takes patientId and finds Patient
	 * @param patientId - Integer value find patient i.e view based on Id
	 * @return patient otherwise throws exception
	 */
	public Patient findPatientById(Integer patientId) throws PatientNotFoundException {
		Patient patient = patientRepository.findById(patientId)
				.orElseThrow(() -> new PatientNotFoundException("Patient not found for this id :: " + patientId));

		return patient;

	}
	/**
	 * This method takes patientId and prescription and adds prescription to the Patient
	 * @param patientId - Integer valueto find patient
	 * @param prescription - String value that is to be added
	 * @return patient added by prescription otherwise throws exception
	 */
	
	public Patient addPrescriptionsById(Integer patientId, String prescription) throws PatientNotFoundException {
		Patient patient = patientRepository.findById(patientId).orElseThrow(() -> new PatientNotFoundException(
				"Patient not found for this id you can't give prescription:: " + patientId));
		patient.setPrescription(prescription);
		return patientRepository.save(patient);
	}
}
