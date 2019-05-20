package com.numtobr.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.numtobr.handler.NumToWordConvertHandler;

/**
 * This test class enables conversion from numbers to words  command prompt
 * @author soumamukherjee
 * @version 1.0
 */
public class TestNumToWords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Enter any integer number from [0 to 999,999,999]");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String numberStr = null;
		try{
			numberStr = reader.readLine();
		}catch (IOException ex) {
			System.out.println("Exception while reading input value.");
			System.exit(1);
		}
		NumToWordConvertHandler handler = new NumToWordConvertHandler();
		String res = handler.converterHandler(numberStr);
		System.out.println("British English word is -> " + res);
	}
}