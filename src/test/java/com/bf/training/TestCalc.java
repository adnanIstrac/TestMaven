package com.bf.training;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class TestCalc {

    @Test
	public void testAdd() {
		Calculator calc = new Calculator();
		int result = calc.add(5, 5);
		assertEquals(10, result);
	}
    
	@Test
	public void testMultiply() {
		Calculator calc = new Calculator();
		int result = calc.multiply(5, 5);
		assertEquals(25, result);
	}
}
