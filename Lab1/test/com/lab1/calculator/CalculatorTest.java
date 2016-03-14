/**
 * 
 */
package com.lab1.calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author tue43460
 *
 */
public class CalculatorTest {
	
	private Calculator calculator;
	
	@Before
	public void setup(){
		calculator = new Calculator();
	}
	
	@Test
	public void addTest(){
		assertEquals(4, calculator.add(2, 2));
	}
	
	@Test
	public void substractTest(){
		assertEquals(9999, calculator.subtract(10000, 1));
	}
	
	@Test
	public void multiplyTest(){
		assertEquals(4, calculator.multiply(2, 2));
	}
	
	@Test
	public void divideTest(){
		assertEquals(2, calculator.divide(4,2));
	}
	
	@Test
	public void isEqualTest(){
		assertTrue(calculator.isEqual(9999, 9999));
	}
}