package for_assignment_1;

public class Part3a {
	
	//Stack is LIFO
	
	public int head;
	public int capacity;
	public int stackArray[];
	
	Part3a(int size) {
		capacity = size;
		head = -1;
		stackArray = new int[size];
	}//initalizes the array
	
	public void push(int elementToPush) {
		stackArray[++head] = elementToPush;
	}//push -- puts an integer at the top of the stack
	
	public int pop() {
		if(head > -1 ) {
			return stackArray[head--];
		} else {
			return -1;
		}
	}//pop -- return that value of the item that was popped off
	//If the stack is empty, it returns -1
	
	public int top() {
		if(head > -1) {
			return stackArray[head];
		}//Array is not empty
		return -1;
	}//top, only returns -1 if the stack is empty
	
	public boolean isEmpty() {
		if(head <= -1) {
			return true;
		}//Stack is Empty
		return false;
	}//isEmpty -- returns true if the stack is empty, false otherwise
}

