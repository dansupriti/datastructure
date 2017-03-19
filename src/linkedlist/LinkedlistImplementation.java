package linkedlist;

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

	public int get(int index){
		Node currentNode = head;
		for(int i=0; i< index; i++){
			currentNode = currentNode.getLink();
		}
		return currentNode.getData();
	}

	public void delete(int index){
		Node currentNode = head;
		if(index == 0){
			currentNode = currentNode.getLink();
			head = currentNode.getLink();
			size--;
		}else {
			int indexForDeletion = index - 1;
			for (int i = 0; i <= indexForDeletion; i++) {
				currentNode = currentNode.getLink();
			}
			
		}
	}
}
