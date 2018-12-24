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
		// If the stack is full a new arr is created to copy all the values into it
		// Then, the current stack is assigned a new arr with twice the size of the origi
		// Finally, all the elements in the temporary arr are pushed onto the current stack
		if (isFull()) {
			long[] tempArr = new long[maxSize];
			
			int counter = 0;
			while(!isEmpty()) {
				tempArr[counter] = pop();
				++counter;
			}
			
			stackArray = new long[maxSize * 2];
			
			for(int i = tempArr.length - 1; i >= 0; --i) {
				push(tempArr[i]);
			}
		}
		
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
