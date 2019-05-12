package com.epam.CalculatorLab;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumCalculatorTest extends BaseTest {

	@Test
	public void twoPlusFourTest() {
		long result = calculator.sum(2, 4);
		assertEquals(result, 6, "Invalid result of sum operation");
	}

	@Test(dataProvider = "ValuesForSumLongTest")
	public void sumTest(long a, long b, long expectedValue) {
		long result = calculator.sum(a, b);
		assertEquals(result, expectedValue, "Invalid result of sub operation");
	}

	@Test(dataProvider = "ValuesForSumDoubleTest")
	public void sumDoubleTest(double a, double b, double expectedValue) {
		double result = calculator.sum(a, b);
		assertEquals(result, expectedValue, "Invalid result of sub operation");
	}

	@Test(expectedExceptions = NumberFormatException.class)
	public void sumMaxLongTest() {
		calculator.sum(9223372036854775806L, 2);
	}

	@DataProvider(name = "ValuesForSumLongTest")
	public Object[][] valuesForSum() {
		// @formatter:off
		return new Object[][] { 
				{ 11, 4, 15 }, 
				{ -12, 14, 2 }, 
				{ -9, -6, -15 }, 
				{ 0, 0, 0 }, 
				{ 6, -9, -3 }, 
				
				{  9223372036854775806L, 1, 9223372036854775807L }
				
		};
		// @formatter:on
	}

	@DataProvider(name = "ValuesForSumDoubleTest")
	public Object[][] doubleValuesForSum() {
		// @formatter:off
		return new Object[][] { 
				{ 5.1, 5.6, 10.7 }, 
				
				{ -3.4, 5.9, 2.5 },
				{ 5.9, -3.4, 2.5 },
				{ -3.4, 3.3, -0.1 },
				{ -2.2, 2.3, 0.1 },
				
				{ 2.5, -1.5, 1.0 },
				
				{ -1.1, 0.1, -1.0 },
				{ -3.3, -2.2, -5.5 },
				{ -2.5, -7.5, -10.0 }, 
				{ 0.0, 0.0, 0.0 },
				{ -9.4, 3.5, -5.9 },
				{ -9.0, 5.0, -4.0 }
		};
		// @formatter:on
	}

}
