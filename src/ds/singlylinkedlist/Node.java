package ds.singlylinkedlist;

public class Node {
	public int data;
	public Node next;
	
	public Node() {
		this.data = -1;
		this.next = null;
	}
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
	
	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}
	
	public void displayNode() {
		System.out.println("{ " + data + " } ");
	}
}
