package com.numtobr.factory;

import com.numtobr.constant.Constants;
import com.numtobr.framework.NumToWordConverter;
import com.numtobr.framework.imp.MillionNumConverter;
import com.numtobr.framework.imp.MultipleTenNumConverter;
import com.numtobr.framework.imp.OneNumConverter;
import com.numtobr.framework.imp.ThreeNumConverter;
import com.numtobr.framework.imp.TwoNumConverter;

/**
 * This is the factory class which provides  appropriate converter methods 
 * @author soumamukherjee
 * @version 1.0
 *
 */
public class ConverterFactory implements Constants {
	
	/**
	 * This class returns instances of the appropriate
	 * converter class on the basis of the number entered
	 * @param numberVal
	 * @return
	 */
	public static NumToWordConverter getNumberConverter(Long numberVal){
		if(numberVal.longValue() < twentyLongVal){
			return new OneNumConverter();
		}else if(numberVal.longValue() < hundredLongVal){
			return new MultipleTenNumConverter();
		}else if(numberVal.longValue() < thousandLongVal){
			return new TwoNumConverter();
		}else if(numberVal.longValue() < millionLongVal){
			return new ThreeNumConverter();
		}else if(numberVal.longValue() < billionLongVal){
			return new MillionNumConverter();
		}
		return null;
	}
}
