package gusto_dsa;

public class QueueArray {
	  int front, rear;
	  int capacity;
	  int queue[];

	  public QueueArray(int c) {
	    front = rear = 0;
	    capacity = c;
	    queue = new int[capacity];
	  }

	  public void queueEnqueue(int a) {
	    if (capacity == rear) {
	      System.out.println("Queue is full.");
	    } else {
	      queue[rear] = a;
	      rear++;
	    }
	  }

	  public void queueDequeue() {
	    if (front == rear) {
	      System.out.println("Queue is empty.");
	    } else {
	      for (int i = 0; i < rear - 1; i++) {
	        queue[i] = queue[i + 1];

	        if (rear < capacity) {
	          queue[rear] = 0;
	        }
	      }
	    }
	  }
	}
