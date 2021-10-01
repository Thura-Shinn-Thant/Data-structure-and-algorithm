package gusto_dsa;

public class TestArray3 {
	  public static void printMin(int[] array1) {
	    int min = array1[0];
	    for (int i = 1; i < array1.length; i++) {
	      if (min < array1[i]) {
	        min = array1[i];
	      }
	    }

	    System.out.println("The minimum number is " + min + ".");
	  }

	  public static void main(String[] args) {
	    int[] array1 = { 33, 3, 4, 5 };
	    printMin(array1);
	  }
	}
