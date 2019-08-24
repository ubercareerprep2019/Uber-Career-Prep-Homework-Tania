package for_assignment_1;

public class Part3b {
	//Queue if FIFO
	//Dequeue(delete) from the front
	//Enqueue(add) from the back
	
	public int head;
	public int tail;
	public int capacity;
	public int queueArray[];
	
	//Initializes the size of the queue array
	Part3b(int size) {
		capacity = size;
		head = -1;
		tail = -1;
		queueArray = new int[size];
	}//Constructor -- Queue-init
	
	//Adds an element to the queue
	public void enqueue(int addElement) {
		if(tail == capacity) {
			System.out.println("The queue is currently full and cannot have more elements added");
		} else {
			queueArray[++tail]= addElement;
		}//if-else
	}//Enqueue
	
	//removes an element from the queue
	public void dequeue(int deleteElement) {
		if(head == tail) {
			System.out.println("Queue is currently empty");
		}else{
			for(int i=0; i < tail; i++) {
				queueArray[i] = queueArray[i++];
			}//for loop
			tail--;
		}//if-else
		return;
	}//Dequeue
	
}
