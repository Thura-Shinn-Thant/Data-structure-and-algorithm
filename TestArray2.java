package gusto_dsa;

public class TestArray2 {
	  public static void main(String[] args) {
	    double[] myArray = { 1.9, 2.9, 3.4, 3.5 };

	    // Print the items in the array
	    for (int i = 0; i < myArray.length; i++) {
	      System.out.println(myArray[i]);
	    }

	    // Calculate total
	    double total = 0;
	    for (int i = 0; i < myArray.length; i++) {
	      total += myArray[i];
	    }
	    System.out.println("Total is " + total);

	    // Find max
	    double max = myArray[0];
	    for (int i = 1; i < myArray.length; i++) {
	      if (myArray[i] > max) {
	        max = myArray[i];
	      }
	    }
	    System.out.println("Max is " + max);
	  }
	}
