/**
 * 
 */
package com.lti.exceptions;

//Course is already full exception
public class CourseFullException extends Exception{
	public String getMessage() {
		String msg="Course is already full";
		return msg;
	}
}
	
