package edu.beth.bu;

import static org.junit.Assert.*;

import org.junit.Test;

public class StackTest {

	@Test
	public void test() {
		Stack<Integer> list = new Stack<Integer>();
		list.push(4);
		list.push(9);
		list.push(2);
		list.push(8);
		list.push(2);
		list.push(9);

		assertEquals(9, (int) list.pop());

	}

}
