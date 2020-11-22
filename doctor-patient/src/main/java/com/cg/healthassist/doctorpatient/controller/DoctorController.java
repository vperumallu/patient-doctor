package com.cg.healthassist.doctorpatient.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
 * This DoctorController class provides GET and PUT
 * 
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
	 * GET method is to view patient
	 */

	@GetMapping("/patient/{patientId}")
	public @ResponseBody Patient getPatientById(@PathVariable("patientId") Integer patientId)
			throws PatientNotFoundException {
		Patient patient = doctorService.findPatientById(patientId);
		return patient;
	}

	/**
	 * PUT method is to update patient by adding prescription
	 */
	@PutMapping("patient/{patientId:.+}/addPrescription/{prescription}")
	public Patient addPrescriptionsById(@PathVariable Integer patientId, @PathVariable String prescription)
			throws PatientNotFoundException {
		return doctorService.addPrescriptionsById(patientId, prescription);
	}

}
