package com.exam.examserver.exception;

import org.springframework.security.core.AuthenticationException;

public class UserNotFoundException extends Exception{
	
	public UserNotFoundException()
	{
		super("User with this Username not found in database !!");
	}
	
	public UserNotFoundException(String msg) {
		super(msg);
		// TODO Auto-generated constructor stub
	}


	
	

}

