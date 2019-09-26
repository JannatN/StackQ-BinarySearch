package edu.beth.bu;

import static org.junit.Assert.*;

import org.junit.Test;

public class QueueTest {

	@Test
	public void test() {
		Queue<Integer> list = new Queue<Integer>();
		list.enqueue(4);
		list.enqueue(9);
		list.enqueue(2);
		assertEquals(4, (int) list.dequeue());

	}

}
