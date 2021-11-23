package com.lti.exceptions;


//UserNotFoundException 
public class UserNotFoundException extends Exception{
	
	public String getMessage() {
		String msg="UserNotFoundException - User not found";
		return msg;
	}

}
