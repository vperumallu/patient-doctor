package com.cg.healthassist.doctorpatient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.healthassist.doctorpatient.exceptions.PatientNotFoundException;
import com.cg.healthassist.doctorpatient.model.Patient;
import com.cg.healthassist.doctorpatient.service.DoctorServiceImpl;

/**
 * @author perumallu
 *
 * 
 */

@RestController
@RequestMapping("/api/v1")

public class DoctorController {
	@Autowired
	private DoctorServiceImpl doctorService;

	/**
	 * this method is to give the url based on the patientId
	 */
	@GetMapping("/patient/{patientId}")
	public @ResponseBody Patient getPatientById(@PathVariable("patientId") Integer patientId)
	throws PatientNotFoundException{
		Patient patient= doctorService.findPatientById(patientId);
				if(patient==null) throw new PatientNotFoundException("Patient not found for this id :: " + patientId);
		//return doctorService.findPatientById(patientId);
		return doctorService.findPatientById(patientId);
	}

	/**
	 * this method is to give the url based on patientId and prescription
	 */
	@PutMapping("patient/{patientId:.+}/addPrescription/{prescription}")
	public Patient addPrescriptionsById(@PathVariable Integer patientId, @PathVariable String prescription) {
		return doctorService.addPrescriptionsById(patientId, prescription);
	}

}
