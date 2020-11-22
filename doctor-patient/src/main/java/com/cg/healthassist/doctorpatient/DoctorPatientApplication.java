package com.cg.healthassist.doctorpatient;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * this class is to run the spring boot application
 * 
 * @author perumallu
 *
 * 
 */

@SpringBootApplication
public class DoctorPatientApplication {
	private static final Logger logger = LogManager.getLogger(DoctorPatientApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DoctorPatientApplication.class, args);
		logger.info("Info log");

	}

}