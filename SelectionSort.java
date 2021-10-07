package gusto_dsa;

import java.util.Arrays;

public class SelectionSort {
	public static void sort(int[] array) {
		// sort your array
		Arrays.sort(array);
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i = i + 1) {
			System.out.println(array[i]);
		}
	}

	public static void main(String[] args) {
		int[] ar1 = { 9, 14, 3, 2, 43, 11, 58, 22 };
		System.out.println("Before SelectionSort");
		sort(ar1);
		printArray(ar1);
	}
}
