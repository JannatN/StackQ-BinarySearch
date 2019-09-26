package edu.beth.bu;

import java.util.LinkedList;

public class Queue<T> {
	LinkedList<T> elements = new LinkedList<T>();
	int size;

	public int size() {
		return elements.size();
	}

	public void enqueue(T e) {
		elements.add(e);

	}

	public T dequeue() {
		return elements.remove(0);

	}

	public T first() {
		return elements.get(0);

	}

}
