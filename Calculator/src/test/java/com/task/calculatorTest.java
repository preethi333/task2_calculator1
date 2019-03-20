package com.task;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class calculatorTest {

	@Test
	public void Additiontest() {
		calculator c =new calculator();
		assertEquals(5,c.addition(2.0, 3.0));
		assertEquals(5,c.addition(2.0, 3.0));
		assertEquals(-3.5,c.addition(5.0, -8.5));
		assertEquals(9,c.addition(3.5, 5.5));
	}
	
	@Test
	void multiplicationtest() {
		calculator c =new calculator();
		assertEquals(10,c.multiplication(2.5, 4));
		assertEquals(-38.5,c.multiplication(-5.5, 7));
		assertEquals(34.1,c.multiplication(5.5, 6.2));
	}
	
	@Test
	void divisiontest() {
		calculator c =new calculator();
		assertEquals(3.5,c.division(7, 2));
		Assertions.assertThrows(ArithmeticException.class, () -> c.division(5, 0));
	}

}
