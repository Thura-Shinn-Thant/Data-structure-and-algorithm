
public class stackarray {
//	maximum is size of array
	int maximum = 100;
// top is pointer
	int top = -1;
	int b[] = new int[maximum];

	public boolean ifitisEmpty() {
		return (top < 0);
	}

	public boolean push(int y) {
		if (top >= (maximum - 1)) {
			System.out.println("Stack overflow");
			return false;
		} else {
			b[+top] = y;
			System.out.println("Push in the stack" + y);
			return true;
		}
	}

	public int pop() {
		if (top < 0) {
			System.out.println("Stack overflow");
			return 0;
		} else {
			return b[top--];

		}
	}

	public int peek() {
		if (top < 0) {
			System.out.println("Stack underflow");
			return 0;
		} else {
			return b[top];
		}
	}

	public static void main(String[] args) {
		stackarray stack1 = new stackarray();
		stack1.push(10);
		stack1.push(20);
		stack1.push(30);

		stack1.pop();
	}
}
