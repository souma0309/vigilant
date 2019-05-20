package com.numtobr.framework.imp;

import com.numtobr.constant.Constants;
import com.numtobr.factory.ConverterFactory;
import com.numtobr.framework.NumToWordConverter;

/**
 * This is the utility class to convert Integer numbers into the equivalent British English words.
 * E.g. 8000001 = "eight million and one". Range of number are 1000000 to 999,999,999
 * @author soumamukherjee
 * @version 1.0
 *
 */
public class MillionNumConverter implements NumToWordConverter,Constants{

	/**
	 * This method enables  convertion of  Integer numbers starting from  
	 * 1000000 to 999,999,999 into equivalent British English words.
	 
	 */
	public String convertNumber(Long number) {
		StringBuffer buffer = new StringBuffer();
		Long tmpNum = new Long(number.longValue() / millionLongVal);
		buffer.append(ConverterFactory.getNumberConverter(tmpNum).convertNumber(tmpNum));
		buffer.append(millionVal);
		tmpNum = new Long(number.longValue() % millionLongVal);
		if(tmpNum.longValue() > zeroLongVal){
			//Additional verification is required to append "and"
			if(tmpNum.longValue() < hundredLongVal){
				buffer.append(andVal);
				buffer.append(ConverterFactory.getNumberConverter(tmpNum).convertNumber(tmpNum));
			}else{
				buffer.append(space);
				buffer.append(ConverterFactory.getNumberConverter(tmpNum).convertNumber(tmpNum));
			}
		}
		return buffer.toString();
	}

}
