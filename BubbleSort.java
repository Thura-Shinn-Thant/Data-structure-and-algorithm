package gusto_dsa;

public class BubbleSort {
	public static void bubblesort1(int[] unsorted) {
		for (int i = 0; i < 7; i = i + 1) {
			for (int a = 0; a < 7 - i; a = a + 1) {
				if (unsorted[a + 1] < unsorted[i]) {
					int temp = unsorted[a];
					unsorted[a] = unsorted[a + 1];
					unsorted[a + 1] = temp;

				}
			}
		}
	}

	public static void main(String[] args) {
		BubbleSort s = new BubbleSort();
		int[] unsorted = new int[] { 5, 3, 8, 9, 2, 1, 7, 10 };
		s.bubblesort1(unsorted);
		for (int i = 0; i < unsorted.length; i++) {
			System.out.print(unsorted[i] + " ");
		}
	}

}
