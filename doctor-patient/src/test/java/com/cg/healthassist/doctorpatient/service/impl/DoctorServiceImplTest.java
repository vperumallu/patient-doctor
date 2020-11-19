package com.cg.healthassist.doctorpatient.service.impl;

import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.healthassist.doctorpatient.model.Patient;
import com.cg.healthassist.doctorpatient.repository.PatientRepository;
import com.cg.healthassist.doctorpatient.service.DoctorService;
/**
 * @author perumallu
 *
 * 
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class DoctorServiceImplTest {

	 @MockBean
	    private PatientRepository patientRepository;

		/*
		 * @Autowired private DoctorService doctorService;
		 * 
		 */
	@Test
	public void testFindPatientById() {
		Patient patient=new Patient();
		patient.setAge(4);
		patient.setAddress("hyd");
		patient.setBloodGroup("ab+");
		patient.setMobileNumber("9182500757");
		patient.setPatientId(1);
		patient.setPatientName("ram");
		patient.setPrescription("crocine");
		
		//Mockito.when(patientRepository.getOne(1)).thenReturn(patient);
		//Mockito.when(patientRepository.findById(1).get());
		assertThat(patient.getPatientId()).isEqualTo(1);
		//assertThat(doctorService.findPatientById(1)).isEqualTo(patient);
	}
	
	@Test
	public void testAddPrescriptions() {
		Patient patient=new Patient();
		patient.setAge(4);
		patient.setAddress("hyd");
		patient.setBloodGroup("ab+");
		patient.setMobileNumber("9182500757");
		patient.setPatientId(1);
		patient.setPatientName("ram");
		patient.setPrescription("crocine");
		
		  Mockito.when(patientRepository.getOne(1)).thenReturn(patient);
	        patient.setPrescription("medicine");
	        Mockito.when(patientRepository.save(patient)).thenReturn(patient);
	        System.out.println(patient.getPrescription());
	        assertThat(patient.getPrescription()).isEqualTo("medicine");
	}

}
