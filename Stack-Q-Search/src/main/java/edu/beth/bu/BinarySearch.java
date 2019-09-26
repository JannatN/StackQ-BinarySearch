package edu.beth.bu;

public class BinarySearch {

	public int find(int[] data, int key) {
		return find(data, key, 0, (data.length - 1));
	}

	public int find(int[] data, int key, int low, int high) {
		int mid = (low + high) / 2;
		if (low > high)
			return -1;

		if (key == data[mid])
			return mid;

		else if (key < data[mid])
			return find(data, key, low, (mid - 1));

		else
			return find(data, key, (mid + 1), high);

	}
}
