package com.cg.healthassist.doctorpatient.exceptions;

import java.util.Date;
/**
 * This is a ErrorDetails exception class
 * @author perumallu
 *
 * 
 */

public class ErrorDetails {
	private Date timestamp;
	private String message;
	private String details;

	public ErrorDetails(Date timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return details;
	}
}
