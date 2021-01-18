package question12;

/*
 * 
 * 12. Implement double ended queue using linked list, in which implement methods for the following 
	  i) Insert element at front 
	  ii) Delete element at front 
	  iii) Insert element at rear 
	  iv) Delete element at rear 
	  v) Display content of stack
 */
public class DequeUsingDoublyLinkedList {

	// class representing Node of a doubly linked list
	static class Node {
        int data;
        Node next, prev;
        public Node(int data) {
            this.data = data;
        }
    }
	
	// front points to start of Deque and rear points to the end of Deque
    private static Node front = null;
    private static Node rear = null;
    private static int size = 0;
	
	//MAIN
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insertFront(5);                 // 5
        insertEnd(10);                  // 5 <-> 10
        insertEnd(11);                  // 5 <-> 10 <-> 11
        insertFront(19);                // 19 <-> 5 <-> 10 <-> 11
        System.out.println(getFront());
        System.out.println(getEnd());
        deleteEnd();                    // 19 <-> 5 <-> 10
        System.out.println(getEnd());
        deleteFront();                  // 5 <-> 10
        System.out.println(getFront());    
        System.out.println(size());
        System.out.println(isEmpty());
        erase();
        System.out.println(isEmpty());
		
		
	}

	private static void erase() {
		// TODO Auto-generated method stub
		// mark rear as null
        rear = null;
        // traverse the doubly linked list
        while (front != null) {
            // delete all the prev pointers
            front.prev = null;
            front = front.next;
        }
        // After this deque looks like
        // a -> b -> c -> d ..., all the previous pointers are destroyed
        // No pointer is pointing to a, so Garbage collector will delete the whole Deque
        
        // set size as 0
        size = 0;
	}

	private static boolean isEmpty() {
		// TODO Auto-generated method stub
		 if (front == null) {
	            return true;
	        }
	        return false;
	}

	private static int size() {
        return size;
    }
	
	
	private static void deleteFront() {
		// TODO Auto-generated method stub
		if (front == null) {
            // no node to delete
            return;
        }
        if (front == rear) {
            // only 1 node is present
            front = rear = null;
        } else {
            // delete front and move front ahead
            front = front.next;
            front.prev = null;
            // Garbage Collector will automatically delete first node
            // as no pointer is pointing to it
        }
        // decrement size
        size--;
	}

	private static void deleteEnd() {
		// TODO Auto-generated method stub
		if (rear == null) {
            // no node to delete
            return;
        }
        if (rear == front) {
            // only 1 node is present
            front = rear = null;
        } else {
            // delete rear and move rear backwards
            rear = rear.prev;
            rear.next = null;
            // Garbage Collector will automatically delete last node
            // as no pointer is pointing to it
        }
        // decrement size
        size--;
	}

	private static int getEnd() {
		// TODO Auto-generated method stub
		if (rear != null) {
            // rear points to last element in Deque, return its data
            return rear.data;
        }
        // no node is present
        return -1;
	}

	private static int getFront() {
		// TODO Auto-generated method stub
		if (front != null) {
            // front points to first element in Deque, return its data
            return front.data;
        }
        // no node is present
        return -1;
	}

	private static void insertEnd(int x) {
		// TODO Auto-generated method stub
		// Create a new Node with required parameters
        Node node = new Node(x);
        if (rear == null) {
            // This is the first node to be inserted
            front = rear = node;
        } else {
            // Insert the node after rear
            rear.next = node;
            node.prev = rear;
            // update rear
            rear = node;
        }
        // Increment size
        size++;
	}

	private static void insertFront(int x) {
		// TODO Auto-generated method stub
		// Create a new Node with required parameters
        Node node = new Node(x);
        if (front == null) {
            // This is the first node to be inserted
            front = rear = node;
        } else {
            // Add the node before front
            node.next = front;
            front.prev = node;
            // update front
            front = node;
        }
        // Increment size
        size++;
	}
	
	

}
