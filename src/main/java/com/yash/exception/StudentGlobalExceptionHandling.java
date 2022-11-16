package com.yash.exception;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class StudentGlobalExceptionHandling {
	
	
	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<String> handleNoSuchElementException(NoSuchElementException noSuchElement)
	{
		return new ResponseEntity<String>("No such element present in database,please change the request",HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(	HttpRequestMethodNotSupportedException.class)
	public ResponseEntity<String> 	handleHttpRequestMethodNotSupportedException(	HttpRequestMethodNotSupportedException 	httpRequestMethodNotSupportedException)
	{
		return new ResponseEntity<String>("No such method present,please change the http method",HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<String> handleIllegalArgumentException(IllegalArgumentException illegalArgumentException){
		
		return new ResponseEntity<String>("No such Property found in the Method",HttpStatus.CONFLICT);
	}
	}


