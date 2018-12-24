package ds.stack;

public class Stack {
	private int maxSize;		// Maximum size of the stack
	private long[] stackArray;	// List of items to be stored
	private int top;			// Position of the last item
	
	public Stack(int size) {
		// Initally there are no elements in the stack
		this.maxSize = size;
		this.stackArray = new long[maxSize];	
		this.top = -1;							
	}
	
	public void push(long j) {
		top++;
		stackArray[top] = j;
	}
	
	public long pop() {
		if (isEmpty()) {
			return -1;
		}
		
		int prevTop = top;
		top--;
		
		return stackArray[prevTop];
	}
	
	public long peak() {
		return stackArray[top];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (maxSize-1 == top);
	}
}
