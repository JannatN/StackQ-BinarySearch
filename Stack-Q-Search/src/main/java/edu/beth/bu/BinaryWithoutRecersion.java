package edu.beth.bu;

public class BinaryWithoutRecersion {
	public int find(int[] data, int key) {
		int low = 0;
		int high = data.length - 1;
		int mid = low + high / 2;
		while (low < high) {
			if (key == data[mid]) {
				return mid;
			} else if (key < data[mid]) {
				high = (mid - 1);
				mid = (low + high) / 2;
				return mid;

			} else if (key > data[mid]) {
				low = (mid + 1);
				mid = (low + high) / 2;
				return mid;
			}

		}
		return -1;

	}
}
