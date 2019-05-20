package com.numtobr.validate;

import com.numtobr.exception.AppException;

/**
 * This class provides validation of  input Integer numbers
 * and provides appropriate responses  for entering wrong input
 * @author soumamukherjee
 * @version 1.0
 *
 */
public class InputNumValidator {
	/**
	 * This method validates the input number of String type.
	 * Numbers should be  between 0 to 999,999,999.
	 * @param numberVal
	 * @return Integer
	 * @throws AppException
	 */
	public Long validate(String numberVal) throws AppException{
		if(numberVal == null){
			throw new AppException("Invalid number.Please enter a valid Integer Number");
		}
		Long number = null;
		try{
			number = new Long(numberVal);
		}catch (NumberFormatException ex) {
			throw new AppException("Invalid number.Please enter a valid Integer Number");
		}

		if(number.longValue() < 0){
			throw new AppException("Negative numbers are not allowed.");
		}
		if(number.longValue() > 999999999){
			throw new AppException("Limit of Number exceeded.");
		}
		return number;
	}
	
	/**
	 * Method to validate the input integer number.
	 * Supporting numbers are between 0 to 999,999,999.
	 * @param number
	 * @return Integer
	 * @throws AppException
	 */
	public Long validate(Long number) throws AppException{
		if(number == null){
			throw new AppException("null value is not supported.Please enter a Integer Number");
		}
		if(number.longValue() < 0){
			throw new AppException("Negative numbers not allowed.");
		}
		if(number.longValue() > 999999999){
			throw new AppException("Limit of Number exceeded.");
		}
		return number;
	}
}
