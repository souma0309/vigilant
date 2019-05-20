package com.numtobr.framework.imp;

import com.numtobr.constant.Constants;
import com.numtobr.factory.ConverterFactory;
import com.numtobr.framework.NumToWordConverter;

/**
 * This utility class enables  convertion of Integer numbers into  equivalent British English words.
 * E.g. 105 = "hundred and five". Range of number are 100 to 999
 * @author soumamukherjee
 * @version 1.0
 *
 */
public class TwoNumConverter implements NumToWordConverter,Constants{

	/**
	 * This method will convert Integer Number ranged between 100 to 999
	 * into the equivalent British English words.
	 * 
	 */
	public String convertNumber(Long number) {
		StringBuffer buffer = new StringBuffer();
		//Since array do not support long value
		buffer.append(initialWords[number.intValue()/hundredIntVal]);
		buffer.append(hundredVal);
		Long tmpNum = new Long(number.longValue() % hundredLongVal);
		if(tmpNum.longValue() > zeroLongVal){
			buffer.append(andVal);
			buffer.append(ConverterFactory.getNumberConverter(tmpNum).convertNumber(tmpNum));
		}
		return buffer.toString();
	}

}
