package edu.beth.bu;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialFncTest {

	@Test
	public void testFactorial() {
		FactorialFnc f = new FactorialFnc();
		assertEquals(6, (int) f.factorial(3));
	}

}
