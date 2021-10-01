package gusto_dsa;

public class StringStackArray {
	  int max = 100;
	  int top = -1;
	  String[] array1 = new String[max];

	  public boolean isEmpty() {
	    return top < 0;
	  }

	  public boolean push(String input) {
	    if (top >= max - 1) {
	      System.out.println("Stack overflow");
	      return false;
	    } else {
	      array1[++top] = input;
	      System.out.println("Pushed " + input + " into the stack");
	      return true;
	    }
	  }

	  public String pop() {
	    if (top < 0) {
	      System.out.println("Stack underflow");
	      return "";
	    } else {
	      return array1[top--];
	    }
	  }

	  public String peek() {
	    if (top < 0) {
	      System.out.println("Stack underflow");
	      return "";
	    } else {
	      return array1[top];
	    }
	  }

	  public static void main(String[] args) {
	    StringStackArray stack1 = new StringStackArray();
	    stack1.push("Mg Mg");
	    stack1.push("Hla Hla");
	    stack1.push("Aye Aye");
	    stack1.push("Moe Moe");
	    stack1.push("Su Su");
	    stack1.push("Thiri");
	  }
	}
