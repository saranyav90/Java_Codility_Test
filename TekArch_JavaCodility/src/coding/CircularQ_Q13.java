package coding;

import java.util.ArrayList;

/*
 * 
 * Circular Queue is a linear data structure in which the operations are performed based on FIFO (First In First Out) principle 
  and the last position is connected back to the first position to make a circle. 
  It is also called ‘Ring Buffer’
  
  **	Operations on Circular Queue: 

	* Front: Get the front item from queue.
	
	* Rear: Get the last item from queue.
	
	*   enQueue(value) This function is used to insert an element into the circular queue. 
	In a circular queue, the new element is always inserted at Rear position. 
	Steps:
	Check whether queue is Full – Check ((rear == SIZE-1 && front == 0) || (rear == front-1)).
	If it is full then display Queue is full. 
	If queue is not full then, check if (rear == SIZE – 1 && front != 0) if it is true then set rear=0 and insert element.
	
	*   deQueue() This function is used to delete an element from the circular queue. 
	In a circular queue, the element is always deleted from front position. 
	Steps:
	Check whether queue is Empty means check (front==-1).
	If it is empty then display Queue is empty. If queue is not empty then step 3
	Check if (front==rear) if it is true then set front=rear= -1 else check if (front==size-1), 
	if it is true then set front=0 and return the element.
	 */

public class CircularQ_Q13 {

	// Declaring the class variables. 
	private int size, front, rear;
	
	// Declaring array list of integer type. 
	private ArrayList<Integer> queuelist = new ArrayList<Integer>(); 
	  
	// Constructor 
	CircularQ_Q13(int size) 
	{ 
	    this.size = size; 
	    this.front = this.rear = -1; 
	} 
	  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initialising new object of CircularQ_Q13 class
		CircularQ_Q13 q=new CircularQ_Q13(5);
		
		q.enQueue(4);
		q.enQueue(2);
		q.enQueue(3);
		q.enQueue(-6);
		
		q.printQueue();
		
		int x = q.deQueue(); 
		  System.out.println(x);
	    // Checking for empty queue. 
	    if(x != -1) 
	    { 
	        System.out.print("Deleted value = "); 
	        System.out.println(x); 
	    } 
	  
	    x = q.deQueue(); 
		
	}

	  int deQueue() {
		
		  int temp; 
		  
		    // Condition for empty queue. 
		    if(front == -1) 
		    { 
		        System.out.print("Queue is Empty"); 
		          
		        // Return -1 in case of empty queue 
		        return -1;  
		    } 
		  
		    temp = queuelist.get(front);
		 // Condition for only one element 
		    if(front == rear) 
		    { 
		        front = -1; 
		        rear = -1; 
		    } 
		  
		    else if(front == size - 1) 
		    { 
		        front = 0; 
		    } 
		    else
		    { 
		        front = front + 1; 
		    } 
		      
		    // Returns the dequeued element 
		    return temp;
	}


	void printQueue() {
		// TODO Auto-generated method stub
		
		// Condition for empty queue. 
		    if(front == -1) 
		    { 
		        System.out.print("Queue is Empty"); 
		        return; 
		    } 
		  
		    // If rear has not crossed the max size 
		    // or queue rear is still greater then 
		    // front. 
		    System.out.print("Elements in the " + 
		                     "circular queue are: "); 
		  
		    if(rear >= front) 
		    { 
		      
		        // Loop to print elements from 
		        // front to rear. 
		        for(int i = front; i <= rear; i++) 
		        { 
		            System.out.print(queuelist.get(i)); 
		            System.out.print(" "); 
		        } 
		        System.out.println(); 
		    } 
		  
		    // If rear crossed the max index and 
		    // indexing has started in loop 
		    else
		    { 
		        // Loop for printing elements from 
		        // front to max size or last index 
		        for(int i = front; i < size; i++) 
		        { 
		            System.out.print(queuelist.get(i)); 
		            System.out.print(" "); 
		        } 
		  
		        // Loop for printing elements from 
		        // 0th index till rear position 
		        for(int i = 0; i <= rear; i++) 
		        { 
		            System.out.print(queuelist.get(i)); 
		            System.out.print(" "); 
		        } 
		        System.out.println(); 
		    } 
	}


	public void enQueue(int data) {
		
		// Condition if queue is full. 
		if((front==0 &&rear==size-1) ||(rear == (front - 1) % (size - 1))) {
			System.out.println("Queue is full already ");
		}
		
		// If queue is empty
		else if (front==-1) {
			front=0;
			rear=0;
			queuelist.set(rear, data);
		}
		
		// If queue is not empty
		else if(rear==size-1&& front!=0) {
			rear = 0; 
	        queuelist.set(rear, data); 
		}
		
		else
	    { 
	        rear = (rear + 1); 
	      
	        // Adding a new element if  
	        if(front <= rear) 
	        { 
	            queuelist.add(rear, data); 
	        } 
	      
	        // Else updating old value 
	        else
	        { 
	            queuelist.set(rear, data); 
	        } 
	    } 
	}

}
