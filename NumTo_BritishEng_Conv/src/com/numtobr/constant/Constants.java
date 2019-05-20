package com.numtobr.constant;

/**
 * This is the interface to contain constant value in a single file
 * @author soumamukherjee
 * @version 1.0
 *
 */
public interface Constants {
	/**
	 * Constant String array used to convert initial Integer numbers
	 * into equivalent words.E.g. 0 = "zero", 11 = "eleven",18="eighteen"
	 * Defined in the respective positions.
	 */
	public static final String[] initialWords = {"zero","one","two","three","four", "five","six","seven","eight","nine","ten","eleven",
		"twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};

	/**
	 * Constant String array used to convert ten multiple Integer numbers 
	 * into equivalent words. E.g. 20 = "twenty". 
	 * Defined in the respective position.
	 */
	public static final String[] tenMultipleWords = {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};

	/**
	 *  Special Constant String
	 */

	public static final String andVal = " and ";
	public static final String space = " ";
	public static final int zeroIntVal = 0;
	public static final long zeroLongVal = 0;
	public static final int tenIntVal = 10;
	public static final long tenLongVal = 10;
	public static final long twentyLongVal = 20;
	public static final int hundredIntVal = 100;
	public static final long hundredLongVal = 100;
	public static final long thousandLongVal = 1000;
	public static final long millionLongVal = 1000000;
	public static final long billionLongVal = 1000000000;
	public static final String hundredVal = " hundred";
	public static final String thousandVal = " thousand";
	public static final String millionVal = " million";
}
