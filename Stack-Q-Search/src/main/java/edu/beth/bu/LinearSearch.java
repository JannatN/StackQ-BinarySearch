package edu.beth.bu;

public class LinearSearch {
	public int find(int[] data, int key) {
		for (int i = 0; i < data.length; i++) {
			if (data[i] == key) {
				return i;
			}

		}

		return -1;

	}

}
