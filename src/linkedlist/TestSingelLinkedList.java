package linkedlist;

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
		for(int i = 0; i< LinkedlistImplementation.size; i++){
			System.out.println(linkedlistImplementation.get(i));
		}
		System.out.println("Insert data in a specific index");
		linkedlistImplementation.addInGivenIndex(70,0);
		linkedlistImplementation.addInGivenIndex(66,3);
		System.out.println("Print the linked list after insertion data::");
		for(int i = 0; i< LinkedlistImplementation.size; i++){
			System.out.println(linkedlistImplementation.get(i));
		}
	}
}
