package com.cg.healthassist.doctorpatient.service;
import com.cg.healthassist.doctorpatient.model.Patient;
/**
 * @author perumallu
 *
 * 
 */


public interface DoctorService {
	
	public Patient findPatientById(Integer patientId);
	public Patient addPrescriptionsById(Integer patientId, String prescription);

}
