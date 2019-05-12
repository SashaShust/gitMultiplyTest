package com.epam.CalculatorLab;

import org.testng.annotations.Test;

public class DivCalculator extends BaseTest {
	@Test(expectedExceptions = NumberFormatException.class)
	public void fiveDivZeroTest() {
		calculator.div(5, 0);
	}
}
