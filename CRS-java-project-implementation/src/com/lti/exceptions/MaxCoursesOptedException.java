/**
 * 
 */
package com.lti.exceptions;

//MaxCoursesOptedException

public class MaxCoursesOptedException extends Exception{
	public String getMessage() {
		String msg="MaxCoursesOptedException - The No. of Course Opted is reached Maximum Limit";
		return msg;
	}
}
