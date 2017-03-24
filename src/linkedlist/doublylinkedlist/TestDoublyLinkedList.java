package linkedlist.doublylinkedlist;

/**
 * Created by supriti.dan on 3/20/17.
 */
public class TestDoublyLinkedList {
	public static void main(String args[]){
		DoublyLinkedListImplementation testDoublyLinkedList = new DoublyLinkedListImplementation();
		testDoublyLinkedList.insertDataAtBegin(10);
		testDoublyLinkedList.insertDataAtBegin(17);
		testDoublyLinkedList.insertDataAtBegin(5);
		testDoublyLinkedList.insertDataAtBegin(11);

		System.out.println("Insert data at the beginning");
		testDoublyLinkedList.displayLinkedList();

		testDoublyLinkedList.insertDataAtEnd(78);
		testDoublyLinkedList.insertDataAtEnd(65);
		System.out.println();
		System.out.println("Insert data at the end");
		testDoublyLinkedList.displayLinkedList();
	}
}
