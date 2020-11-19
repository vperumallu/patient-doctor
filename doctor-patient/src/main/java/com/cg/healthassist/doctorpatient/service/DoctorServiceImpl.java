package com.cg.healthassist.doctorpatient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.healthassist.doctorpatient.model.Patient;
import com.cg.healthassist.doctorpatient.repository.PatientRepository;
/**
 * @author perumallu
 *
 * 
 */


@Service
@Transactional
public class DoctorServiceImpl implements DoctorService {
	@Autowired
	private PatientRepository patientRepository;
	
	public Patient findPatientById(Integer patientId) {
		return patientRepository.findById(patientId).get();
	}
		public Patient addPrescriptionsById(Integer patientId, String prescription) {
		Patient patient=patientRepository.findById(patientId).get();
		patient.setPrescription(prescription);
		return  patientRepository.save(patient);
	}
	}

