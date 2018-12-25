package ds.doublylinkedlist;

public class Node {
	public int data;
	public Node next;
	public Node previous;
	
	public Node() {
		this.data = -1;
		this.next = null;
		this.previous = null;
	}
	
	public Node(int data) {
		this.data = data;
		this.next = null;
		this.previous = null;
	}
	
	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
		this.previous = null;
	}
	
	public Node(int data, Node next, Node prev) {
		this.data = data;
		this.next = next;
		this.previous = prev;
	}
	
	public void displayNode() {
		System.out.println("{ " + data + " } ");
	}
}
