package edu.beth.bu;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class BinaryWithoutRecersionTest {

	@Test
	public void test() {
		BinaryWithoutRecersion b = new BinaryWithoutRecersion();
		int[] array = { 3, 6, 2, 8, 5 };
		Arrays.sort(array);
		assertEquals(2, b.find(array, 5));
	}

}
