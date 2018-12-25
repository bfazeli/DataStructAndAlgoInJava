package ds.cirucularlinkedlist;

public class CircularLinkedList {
	private Node first;
	private Node last;
	
	public void insertFirst(int data) {
		Node newNode = new Node(data);
		
		if(isEmpty()) {
			last = newNode;
		}
		
		newNode.next = first;
		first = newNode;
	}

	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return first == null;
	}
	
	private void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()) {
			first = newNode;
			last = first;
		} 
		else {
			last.next = newNode;
			last = newNode;
		}
	}
}
