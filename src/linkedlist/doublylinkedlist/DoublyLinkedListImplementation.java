package linkedlist.doublylinkedlist;

/**
 * Created by supriti.dan on 3/20/17.
 */
public class DoublyLinkedListImplementation {
	private Node head;
	private Node tail;
	public static int size;

	//insert data at the begin
	public void insertDataAtBegin(int data){
		Node newNode = new Node(data, null);
		if(size == 0){
			head = newNode;
			tail = newNode;
		}else{
			newNode.setLink(head);
			head = newNode;
			tail.setLink(head);
		}
		size ++;
	}

	//insert data at the end
	public void insertDataAtEnd(int data){
		Node newNode = new Node(data, null);
		if(size == 0){
			insertDataAtBegin(data);
		}else{
			tail.setLink(newNode);
			tail = newNode;
			tail.setLink(head);
		}
		size++;
	}

	//insert data at specific index

	//delete data at the begin

	//delete data at the end

	//delete data at specific index

	//display all the data in linked list
	public void displayLinkedList(){
		if(size == 0){
			System.out.println("Its an Empty Linked List");
		}else{
			Node tempNode = head;
			do{
				System.out.print("->" + tempNode.getData());
				tempNode = tempNode.getLink();
			}while(tempNode != head);
		}
	}

	//search data by specific index

}
