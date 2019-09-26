package edu.beth.bu;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Random;

import org.junit.Test;

public class LinearSearchTest {

	@Test
	public void testLinearSerach() {
		LinearSearch ls = new LinearSearch();
		int[] array = { 8, 2, 5, 1, 7, 4 };
		Arrays.sort(array);
		assertEquals(3, ls.find(array, 5));

	}

}
