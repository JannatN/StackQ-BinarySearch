package edu.beth.bu;

import java.util.LinkedList;

public class Stack<T> {
	LinkedList<T> elements = new LinkedList<T>();
	

	public int size() {
		return elements.size();
	}

	public void push(T e) {
		elements.add(0, e);

	}

	public T pop() {
		return elements.remove(0);

	}

	public T top() {
		return elements.get(0);

	}

}
