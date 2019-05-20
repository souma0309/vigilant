package com.numtobr.handler;

import com.numtobr.constant.Constants;
import com.numtobr.exception.AppException;
import com.numtobr.factory.ConverterFactory;
import com.numtobr.validate.InputNumValidator;
/**
 * This class acts as a handler  to enable convertion of  Integer numbers 
 * into equivalent British English words.
 * E.g. 7 = "seven", 25 = "twenty five", 103 = "hundred and three"
 * @author soumamukherjee
 * @version 1.0 
 *
 */
public class NumToWordConvertHandler implements Constants{
	private InputNumValidator validator;
	
	public NumToWordConvertHandler(){
		this.validator = new InputNumValidator();
	}
	
	/**
	 * This method handles Integer numbers into equivalent
	 * British English words conversion.
	 * @param numberVal
	 * @return
	 */
	public String converterHandler(String numberVal){
		Long number = null;
		try{
			number = validator.validate(numberVal);
		}catch (AppException ex) {
			return ex.getMessage();
		}
		return ConverterFactory.getNumberConverter(number).convertNumber(number);
	}
	
	/**
	 * Overloaded method to handle Integer numbers into the 
	 * equivalent British English words conversion.
	 * @param number
	 * @return
	 */
	public String converterHandler(Long number){
		Long validatedNum = null;
		try{
			validatedNum = validator.validate(number);
		}catch (AppException e) {
			return e.getMessage();
		}
		return ConverterFactory.getNumberConverter(validatedNum).convertNumber(validatedNum);
	}
}