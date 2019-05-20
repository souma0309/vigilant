package com.numtobr.framework.imp;

import com.numtobr.constant.Constants;
import com.numtobr.factory.ConverterFactory;
import com.numtobr.framework.NumToWordConverter;

/**
 * This utility class enables convertion of Integer numbers into 
 * equivalent British English words.E.g. 5223 = "five thousand two hundred and twenty three". Range of number are 1000 to 999,999
 * @author soumamukherjee
 * @version 1.0
 *
 */
public class ThreeNumConverter implements NumToWordConverter,Constants{

	/**
	 * This method enables  convertion of Integer numbers ranges between 1000 to 999,999
	 * into equivalent British English words.
	 * 
	 */
	public String convertNumber(Long number) {
		StringBuffer buffer = new StringBuffer();
		Long tmpNum = new Long(number.longValue() / thousandLongVal);
		buffer.append(ConverterFactory.getNumberConverter(tmpNum).convertNumber(tmpNum));
		buffer.append(thousandVal);
		tmpNum = new Long(number.longValue() % thousandLongVal);
		if(tmpNum.longValue() > zeroLongVal){
			//special case to append and
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
