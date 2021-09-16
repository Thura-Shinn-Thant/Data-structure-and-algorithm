import java.util.LinkedList;
import java.util.Stack;

public class stacklinkedlist {
	LinkedList linkedList1 = new LinkedList();

	public void push(int a) {
		linkedList1.addFirst(a);
	}

	public int pop() {
		return (int) linkedList1.removeFirst();
	}

	public static void main(String[] args) {
		Stack stack1 = new Stack();
		stack1.push(5);
		stack1.push(6);
		stack1.push(7);
		stack1.push(8);
		stack1.push(9);
		stack1.push(10);
		System.out.println("After pushing 6 numbers => " + stack1);

		stack1.pop();
		stack1.pop();
		System.out.println("After popping twice => " + stack1);
	}
}
