package com.cg.healthassist.doctorpatient.service;
import com.cg.healthassist.doctorpatient.exceptions.PatientNotFoundException;
import com.cg.healthassist.doctorpatient.model.Patient;
/**
 * This is an interface for DoctorService Class
 * @author perumallu
 *
 * 
 */


public interface DoctorService {
	/**
	 * This method takes patientId and finds Patient
	 */
	public Patient findPatientById(Integer patientId) throws PatientNotFoundException;
	/**
	 * This method takes PatientId and prescription and adds Prescription
	 */
	public Patient addPrescriptionsById(Integer patientId, String prescription) throws PatientNotFoundException;

}
