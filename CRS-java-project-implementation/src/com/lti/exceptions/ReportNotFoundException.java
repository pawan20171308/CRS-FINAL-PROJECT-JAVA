package com.lti.exceptions;


//ReportNotFoundException
public class ReportNotFoundException extends Exception {
	public String getMessage() {
		String msg="Course is already full";
		return msg;
	}
}
