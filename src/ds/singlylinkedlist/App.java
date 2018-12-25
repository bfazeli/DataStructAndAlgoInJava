package ds.singlylinkedlist;

public class App {

	public static void main(String[] args) {
		
		SinglyLinkedList myList = new SinglyLinkedList();
		
		myList.insertFirst(100);
		myList.insertFirst(50);
		myList.insertFirst(80);
		myList.insertFirst(300);
		myList.insertFirst(20);
		myList.insertLast(1000);
		
		
		myList.displayList();
	}

}
