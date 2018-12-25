package ds.doublylinkedlist;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList list = new DoublyLinkedList();
		list.insertFirst(22);
		list.insertFirst(45);
		list.insertFirst(68);
		list.insertLast(10);
		
		list.displayForward();
		
		list.deleteFirst();
		list.displayForward();
		list.deleteLast();
		
		list.displayBackwards();
		
		list.insertAfter(45, 10);
		list.displayForward();
		
		list.deleteKey(10);
		list.displayForward();
	}

}
