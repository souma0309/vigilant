package com.numtobr.exception;

/**
 * This is the custom exception class which 
 * to handle exception
 * @author soumamukherjee
 * @version 1.0
 */
public class AppException extends Exception{
	
	/**
	 * Allows version control
	 * This value is generated using SerialVerion
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * This is the Default constructor
	 */
	public AppException(){	
	}
	
	/**
	 * This is the constructor with arguments
	 * @param message
	 */
	public AppException(String message){
		super(message);
	}
}
