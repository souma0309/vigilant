package com.numtobr.framework.imp;

import com.numtobr.constant.Constants;
import com.numtobr.factory.ConverterFactory;
import com.numtobr.framework.NumToWordConverter;

/**
 * This utility class enables conversion of integer numbers into the equivalent 
 * British English words. E.g. 25 = "twenty five". Range of numbers are 20 to 99
 * @author soumamukherjee
 * @version 1.0
 *
 */
public class MultipleTenNumConverter implements NumToWordConverter,Constants{

	/**
	 * This method enables convertion of Integer numbers starting from 20 to 99
	 * into its equivalent British English words.
	 * 
	 */
	public String convertNumber(Long number) {
		StringBuffer buffer = new StringBuffer();
		//Since array doesn't support long value
		buffer.append(tenMultipleWords[number.intValue() / tenIntVal]);
		Long tmpNum = new Long(number.longValue() % tenLongVal);
		if(tmpNum.longValue() > zeroLongVal){
			buffer.append(space).append(ConverterFactory.getNumberConverter(tmpNum).convertNumber(tmpNum));
		}
		return buffer.toString();
	}

}
