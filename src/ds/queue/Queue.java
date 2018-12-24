package ds.queue;

public class Queue {
	private int maxSize;
	private long[] queueArray;
	private int front;
	private int rear;
	private int nItems;
	
	public Queue(int size) {
		this.maxSize = size;
		this.queueArray = new long[maxSize];
		this.front = 0;
		this.rear = -1;
		this.nItems = 0;
	}
	
	public void insert(long val) {
		if (isFull()) {
			long[] tempArr = this.queueArray;
			int i = front;
			
			this.front = 0;
			this.nItems = 0;
			this.rear = -1;
			
			this.queueArray = new long[maxSize * 2];
			
			for (; i < tempArr.length; ++i) {
				insert(tempArr[i]);
			}
		}
		
		++rear;
		queueArray[rear] = val;
		++nItems;
	}
	
	public long remove() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		
		--nItems;
		
		int prevFront = front;
		++front;
		
		return queueArray[prevFront];
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return nItems == 0;
	}

	public boolean isFull() {
		return nItems == maxSize;
	}
}
