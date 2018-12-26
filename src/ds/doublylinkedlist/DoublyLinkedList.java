package ds.doublylinkedlist;

public class DoublyLinkedList {
	Node first;
	Node last;
	static int length = 0;
	
	public void insertFirst(int data) {
		Node newNode = new Node(data);
		
		if (isEmpty()) {
			last = newNode;
		}
		else {
			first.previous = newNode;
			newNode.next = first;
		}
		
		first = newNode;
		++length;
	}
	
	public void insertLast(int data) {
		Node newNode = new Node(data);
		
		if (isEmpty()) {
			first = newNode;
		}
		else {
			last.next = newNode;
			newNode.previous = last;
		}
		
		last = newNode;
		++length;
	}

	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return first == null;
	}
	
	public Node deleteFirst() {
		Node temp = first;
		
		// If there's only one element simply set last to null
		if(first.next == null) {
			last = null;
		}
		else {
			first.next.previous = null;
		}

		first = first.next;
		temp.next = null;
		--length;
		
		return temp;
	}
	
	public Node deleteLast() {
		Node temp = last;
		
		if(first.next == null) {
			first = null;
		}
		else {
			last.previous.next = null;
		}
		
		last = last.previous;
		temp.previous = null;
		--length;
		
		return temp;
	}
	
	public boolean insertAfter(int key, int data) {
		Node current = first;
		
		while (current.data != key) {
			current = current.next;
			if (current == null) {
				return false;
			}
		}
		
		Node newNode = new Node(data);
		if (current == last) {
			last = newNode;
		} else {
			newNode.next = current.next;
			current.next.previous = newNode;
		}
		
		newNode.previous = current;
		current.next = newNode;
		
		++length;
		return true;
	}
	
	public Node deleteKey(int key) {
		Node temp = first;
		
		while(temp.data != key) {
			temp = temp.next;
			if(temp == null) {
				return temp;
			}
		}
		
		if(temp == first) {
			first = first.next;
			first.previous.next = null;
			first.previous = null;
		} else if (temp == last) {
			last = last.previous;
			last.next.previous = null;
			last.next = null;
		} else {
			temp.next.previous = temp.previous;
			temp.previous.next = temp.next;
		}
		
		temp.next = null;
		temp.previous = null;
		--length;
		
		return temp;
	}
	
	public void displayForward() {
		System.out.println("List has " + length + " (first --> last) ");
		
		Node current = first;
		while(current != null) {
			System.out.println("{ " + current.data + " } ");
			current = current.next;
		}
	}
	
	public void displayBackwards() {
		System.out.println("List has " + length + " (last --> first) ");
		
		Node current = last;
		while(current != null) {
			System.out.println("{ " + current.data + " } ");
			current = current.previous;
		}
	}
}
