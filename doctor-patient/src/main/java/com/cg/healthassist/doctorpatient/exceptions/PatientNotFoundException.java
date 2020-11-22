package com.cg.healthassist.doctorpatient.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * This is a CustomedException class
 * 
 * @author perumallu
 *
 * 
 */

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class PatientNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public PatientNotFoundException(String message) {
		super(message);
	}
}
