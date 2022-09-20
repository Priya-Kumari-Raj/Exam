package com.exam.examserver.exception;



import org.springframework.security.core.AuthenticationException;

public class UsernameNotFoundException extends AuthenticationException{

	
	public UsernameNotFoundException(String msg) {
		super(msg);
		// TODO Auto-generated constructor stub
	}

}
