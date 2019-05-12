package com.epam.CalculatorLab;

import com.epam.tat.module4.Calculator;

public class Main {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		long a = c.sum(9223372036854775806L, 2);
		System.out.println(a);
		System.out.println(9223372036854775806L + 2);
	}

}
