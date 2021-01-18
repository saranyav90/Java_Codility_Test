package question14;

import java.util.Stack;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Create a queue with items 1 2 3*/
		MyQueue q=new MyQueue();
		q.s1=new Stack<Integer>();
		q.s2=new Stack<Integer>();
		
		enQueue(q,1);
		//enQueue(q,2);
		//enQueue(q,3);
		
		/* Dequeue items */
		System.out.println(deQueue(q) + " ");
		System.out.println(deQueue(q) + " ");
	}

	/* Function to deQueue an item from queue */
	 static int deQueue(MyQueue q) {
		
		 int x=0;
		 
		 /* If both stacks are empty then error */
		 if(q.s1.isEmpty() && q.s2.isEmpty()) {
			 System.out.println("Both stacks are empty");
			 System.exit(0); 
		 }
		 
		 /* Move elements from stack1 to stack 2 only if stack2 is empty */
		if(q.s2.isEmpty()) {
			while(!q.s1.isEmpty()) {
				x=pop(q.s1);
				push(q.s2,x);
			}
			x=pop(q.s2);
		}
		return x;
	}

	 static int pop(Stack<Integer> top_ref) {
		 /*If stack is empty then error */
		 if(top_ref.isEmpty()) {
			 System.out.println("Error: STack Underflow");
			 System.exit(0); 
		 }
		 
		// pop the data from the stack 
		 return top_ref.pop();
	}

	// Function to enqueue an item to the queue 
	 static void enQueue(MyQueue q, int i) {
		// TODO Auto-generated method stub
		 push(q.s1,i);
	}

	 /* Function to push an item to stack*/
	 static void push(Stack<Integer> top_ref, int i) {
		// TODO Auto-generated method stub
		top_ref.push(i);
	}

}
