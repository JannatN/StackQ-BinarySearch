package edu.beth.bu;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Random;

import org.junit.Test;

import edu.beth.bu.BinarySearch;


public class BinarySearchTest {

	@Test
	public void testFindRecersive() {
		BinarySearch b = new BinarySearch();
		int[] array = { 3, 6, 2, 8, 5 };
		Arrays.sort(array);
		assertEquals(2, b.find(array, 5));
	}

	@Test
	public void testFindKey() {
		BinarySearch b = new BinarySearch();
		int[] array = { 3, 6, 2, 8, 5 };
		Arrays.sort(array);
		assertEquals(2, b.find(array, 5, 0, array.length - 1));
	}

}
