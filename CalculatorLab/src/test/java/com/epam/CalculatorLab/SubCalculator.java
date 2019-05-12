package com.epam.CalculatorLab;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class SubCalculator extends BaseTest {

	@Test
	public void fourMinusOneTest() {
		long result = calculator.sub(4, 1);
		assertTrue(result == 3, "Invalid result of sub operation");
	}
}
