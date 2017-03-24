package linkedlist.singlelinkedlist;

/**
 * Created by supriti.dan on 3/18/17.
 */
public class LinkedlistImplementation {
	private Node head = null;
	public static int size;


	public void addAtBegin(int data){
		Node newNode = new Node(data,null);
		if(head == null) {
			head = newNode;
		}else{
			newNode.setLink(head);
			head = newNode;
		}
		size++;
	}
	public void addInGivenIndex(int data, int index){
		Node newNode = new Node(data,null);
		Node tempNode = head;
		if(index == 0){
			newNode.setLink(head);
			head = newNode;
			size++;
		}else {
			int indexForInsertion = index - 1;
			for (int i = 0; i < indexForInsertion; i++) {
				tempNode = tempNode.getLink();
			}
			newNode.setLink(tempNode.getLink());
			tempNode.setLink(newNode);
		}
		size++;
	}

	public void addAtEnd(int data){
		Node  newNode = new Node(data, null);
		Node currentNode = head;
		while (currentNode.getLink() != null){
			currentNode = currentNode.getLink();
		}
		currentNode.setLink(newNode);
		size++;
	}

	public void deleteAtBegin(){
		head = head.getLink();
		size--;
	}
	public void deleteAtSpecificIndex(int index){
		Node currentNode = head;
		if(index == 0){
			currentNode = currentNode.getLink();
			head = currentNode.getLink();
			size--;
		}else {
			for (int i = 0; i < index - 1; i++) {
				currentNode = currentNode.getLink();
			}
			currentNode.setLink(currentNode.getLink().getLink());
			size--;
		}
	}
	public void deleteAtEnd(){
		if(size == 0){
			System.out.println("Empty linked list.");
		}else{
			Node currentNode = head;
			while(currentNode.getLink().getLink() != null){
				currentNode = currentNode.getLink();
			}
			currentNode.setLink(null);
			size--;
		}
	}

	public int searchByIndex(int index){
		Node currentNode = head;
		for(int i=0; i< index; i++){
			currentNode = currentNode.getLink();
		}
		return currentNode.getData();
	}
	public void displayLinkedLsit(){
		Node currentNode = head;
		while(currentNode != null){
			System.out.print("->" + currentNode.getData());
			currentNode = currentNode.getLink();
		}
	}
}
