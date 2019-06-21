package for_assignment_1;

public class Part4<T extends Comparable<T>> {
	
	private Node<T> head;
	private int size;
	
	private class Node<T> {
		private T data;
		private Node<T> next;
		
		public Node(T data) {
			next = null;
			this.data = data;
		}//Constructor
	}//Inner Node Class
	
	public Part4(){
		head = new Node<>(null);
		size = 0;
	}
	
	//Adds a node to the end of the list
	public void pushBack(T data) {
		Node<T> addNode = new Node<T>(data);
		Node<T> current = head;
		if(head == null) {
			head = addNode;
			size++;
		}//if
		while(head.next != null) {
			current = current.next;
		}//while
		current.next = addNode;
		size++;
	}//pushBack
	
	//Removes a single node from the end of the list
	public void popBack(){
		Node<T> current = head;
		Node<T> trailer = head;
		if(head == null) {
			System.out.println("The linked list is empty");
		}//if
		while(head.next != null) {
			trailer = current;
			current = current.next;
		}//while
		trailer.next = null;
		size--;
	}//popBack
	
	//Adds a single node containing data to a chosen location in the list. 
	//If the index is above the size of the list, do nothing.
	public void insert(int index, T data) {
		int tracker = 0;
		Node<T> addNode = new Node<T>(data);
		Node<T> current = head;
		Node<T> temp = head.next;
		if(head == null || index>size) {
			System.out.println("Index is out of range, cannot be added to specified located");
		}//if
		while(head.next != null && tracker<index) {
			tracker++;
			temp = temp.next;
			current = current.next;
		}//while
		if(temp==null) {
			current.next = addNode;
			size++;
		}//index is also the end of the list
		current.next = addNode;
		addNode.next = temp;
		size++;
	}//insert at index
	
	
	//erases a single node at a specified index
	public void erase(int index) {
		int tracker = 0;
		Node<T> current = head;
		Node<T> trailer = null;
		if(head == null || index>size) {
			System.out.println("Node cannot be deleted since index is out of range");
		}//if
		while(head.next != null && tracker<index) {
			tracker++;
			trailer = current;
			current = current.next;
		}//while
		if(head.next == null || tracker>index) {
			System.out.println("index is out of range");
		}//if
		current.next = trailer.next;
		size--;
	}//erase
	
	//returns a single node at the index location in the list
	public Node<T> elementAt(int index) {
		int tracker = 0; 
		Node<T> current = head;
		if(head == null || index>size) {
			System.out.println("Index is larger than the current size of the linkedList");
			return null;
		}//if
		while(head.next != null && tracker<index) {
			tracker++;
			current = current.next;
		}//while
		if(tracker == index) {
			return current;
		}//if
		return null;
	}//elementAt
	
	public int size() {
		return size;
	}//size
	
	
	
}//Part4 CLass
