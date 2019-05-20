package com.numtobr.framework.imp;

import com.numtobr.constant.Constants;
import com.numtobr.framework.NumToWordConverter;

/**
 * This utility class enables  convertion  Integer numbers into 
 * equivalent British English words. E.g. 7 = "seven", 19 = "nineteen". Range of number are 0 to 19
 * @author soumamukherjee
 * @version 1.0
 *
 */
public class OneNumConverter implements NumToWordConverter,Constants{

	/**
	 * This method enables conversion of initial Integer numbers (0 to 19)
	 * to equivalent British English words.
	 * 
	 */
	public String convertNumber(Long number) {
		StringBuffer buffer = new StringBuffer();
		//Since array doesn't support long value
		buffer.append(initialWords[number.intValue()]);
		return buffer.toString();
	}

}
