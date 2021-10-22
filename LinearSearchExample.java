package gusto_dsa;

public class LinearSearchExample {
	public static int search(int inputArray[], int x) {
	    for (int i = 0; i < inputArray.length; i++) {
	      if (inputArray[i] == x) {
	        return i;
	      }
	    }

	    return -1;
	  }

	  public static void main(String[] args) {
	    int array1[] = { 2, 3, 4, 10, 40 };
	    int x = 10;

	    int result = search(array1, x);

	    if (result == -1) {
	      System.out.println("Element is not present in array.");
	    } else {
	      System.out.println("Element is at index " + result);
	    }
	  }
}
