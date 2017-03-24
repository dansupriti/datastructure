package linkedlist.singlelinkedlist;

/**
 * Created by supriti.dan on 3/18/17.
 */
public class TestSingelLinkedList {
	public static void main(String args[]){
		LinkedlistImplementation linkedlistImplementation = new LinkedlistImplementation();
		linkedlistImplementation.addAtBegin(10);
		linkedlistImplementation.addAtBegin(15);
		linkedlistImplementation.addAtBegin(33);
		linkedlistImplementation.addAtBegin(45);
		System.out.println("Size of linked list is :: " + LinkedlistImplementation.size);
		System.out.println("Print the linked list ::");
		linkedlistImplementation.displayLinkedLsit();

		System.out.println();
		System.out.println("Insert data in a specific index");
		linkedlistImplementation.addInGivenIndex(70,0);
		linkedlistImplementation.addInGivenIndex(66,3);
		System.out.println("Print the linked list after insertion data::");
		linkedlistImplementation.displayLinkedLsit();

		System.out.println();
		linkedlistImplementation.deleteAtSpecificIndex(3);
		System.out.println("Linked list after deletion ::");
		linkedlistImplementation.displayLinkedLsit();

		linkedlistImplementation.addAtEnd(55);
		linkedlistImplementation.addAtEnd(78);
		System.out.println();
		System.out.println("Linked list after addition at the end ::");
		linkedlistImplementation.displayLinkedLsit();

		linkedlistImplementation.deleteAtBegin();
		System.out.println();
		System.out.println("Linked list after deletion at the begin ::");
		linkedlistImplementation.displayLinkedLsit();

		linkedlistImplementation.deleteAtEnd();
		System.out.println();
		System.out.println("Linked list deletion at the end ::");
		linkedlistImplementation.displayLinkedLsit();

		System.out.println();
		System.out.println("Search Element By Index ::" + linkedlistImplementation.searchByIndex(2));
	}
}
