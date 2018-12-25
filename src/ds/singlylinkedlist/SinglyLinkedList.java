package ds.singlylinkedlist;

public class SinglyLinkedList {
	private Node first;
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void insertFirst(int data) {
		Node newNode = new Node(data, first);
		first = newNode;
	}
	
	public void insertLast(int data) {
		Node current = first;
		while(current.next != null) {
			current = current.next;
		}
		
		current.next = new Node(data);
	}
	
	public Node deleteFirst() {
		Node temp = first;
		first = first.next;
		return temp;
	}
	
	public void displayList() {
		System.out.println("List (first --> last) ");
		
		Node current = first;
		while(current != null) {
			System.out.println("{ " + current.data + " } ");
			current = current.next;
		}
	}
}
