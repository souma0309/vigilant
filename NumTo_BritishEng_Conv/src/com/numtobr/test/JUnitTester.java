package com.numtobr.test;

import com.numtobr.handler.NumToWordConvertHandler;
import junit.framework.TestCase;

/**
 * This test class validates the conversion functionality from number to words
 * @author soumamukherjee
 * @version 1.0
 *
 */
public class JUnitTester extends TestCase {
	private NumToWordConvertHandler handler;
	
	public JUnitTester(){
		this.handler = new NumToWordConvertHandler();
	}
	
	public void testFirstCase()
	{
		//Input Integer Number
		Long number = new Long(0);
		//Output in British English word
		String response = handler.converterHandler(number);
		//Verify the output with expected result
		assertEquals("zero",response);
	}
	
	
	public void testSecondCase()
	{
		//Input Integer Number
		Long number = new Long(1);
		//Output in British English word
		String response = handler.converterHandler(number);
		//Verify the output with expected result
		assertEquals("one",response);
	}
	
	public void testThirdCase()
	{
		//Input Integer Number
		Long number = new Long(21);
		//Output in British English word
		String response = handler.converterHandler(number);
		//Verify the output with expected result
		assertEquals("twenty one",response);
	}
	
	public void testFourthCase()
	{
		//Input Integer Number
		Long number = new Long(4334);
		//Output in British English word
		String response = handler.converterHandler(number);
		//Verify the output with expected result
		assertEquals("four thousand three hundred and thirty four",response);
	}
	
	public void testFifthCase()
	{
		//Input Integer Number
		Long number = new Long(50789);
		//Output in British English word
		String response = handler.converterHandler(number);
		//Verify the output with expected result
		assertEquals("fifty thousand seven hundred and eighty nine",response);
	}
	
	public void testSixthCase()
	{
		//Input Integer Number
		Long number = new Long(652374);
		//Output in British English word
		String response = handler.converterHandler(number);
		//Verify the output with expected result
		assertEquals("six hundred and fifty two thousand three hundred and seventy four",response);
	}
	
	public void testSeventhCase()
	{
		//Input Integer Number
		Long number = new Long(7634507);
		//Output in British English word
		String response = handler.converterHandler(number);
		//Verify the output with expected result
		assertEquals("seven million six hundred and thirty four thousand five hundred and seven",response);
	}
	
	public void testEighthCase()
	{
		//Input Integer Number
		Long number = new Long(8000001);
		//Output in British English word
		String response = handler.converterHandler(number);
		//Verify the output with expected result
		assertEquals("eight million and one",response);
	}
	
	public void testNinthCase()
	{
		//Input Integer Number
		Long number = new Long(8000101);
		//Output in British English word
		String response = handler.converterHandler(number);
		//Verify the output with expected result
		assertEquals("eight million one hundred and one",response);
	}
	
	public void testTenthCase()
	{
		//Input Integer Number
		Long number = new Long(8001001);
		//Output in British English word
		String response = handler.converterHandler(number);
		//Verify the output with expected result
		assertEquals("eight million one thousand and one",response);
	}
	
	public void testEleventhCase()
	{
		//Input Integer Number
		Long number = new Long(8000067);
		//Output in British English word
		String response = handler.converterHandler(number);
		//Verify the output with expected result
		assertEquals("eight million and sixty seven",response);
	}
	
	public void testNegativeNumCase()
	{
		//Input Integer Number
		Long number = new Long(-1);
		//Output in British English word
		String response = handler.converterHandler(number);
		//Verify the output with expected result
		assertEquals("Negative numbers are not allowed.",response);
	}
	
	public void testMaxLimit()
	{
		//Input Integer Number
		Long number = new Long(1000000000);
		//Output in British English word
		String response = handler.converterHandler(number);
		//Verify the output with expected result
		assertEquals("Limit of Number exceeded.",response);
	}
}