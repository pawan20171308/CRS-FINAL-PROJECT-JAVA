/**
 * 
 */
package com.lti.exceptions;

//CourseAlreadyRegistered Exception
public class CourseAlreadyRegistered extends Exception{
	
	public String getMessage() {
		String msg="Course is already registered!";
		return msg;
	}

}
