package codingquestion10;

import java.util.NoSuchElementException;

/*
 * 
 * 10. Write a java program to implement your own stack data structure to store any number of items.
 *  And implement the following operations 1.push 2. pop 3. peek 4.display stack content
 */

public class ArrayStack {

	int[] arr;
	int top,size,len;
	
	public  ArrayStack(int n){
		 size=n;
		 len=0;
		 arr=new int[size];
		 top=-1;
	 }
	
	/*  Function to check if stack is empty */
    public boolean isEmpty()
    {
        return top == -1;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	public void push(int i) {
		// TODO Auto-generated method stub
		 if(top + 1 >= size)
	            throw new IndexOutOfBoundsException("Overflow Exception");
	        if(top + 1 < size )
	            arr[++top] = i;
	        len++ ;
	}

	public int pop() {
		// TODO Auto-generated method stub
		 if( isEmpty() )
	            throw new NoSuchElementException("Underflow Exception");
	        len-- ;
	        return arr[top--];
	}

	public int peek() {
		// TODO Auto-generated method stub
		 if( isEmpty() )
	            throw new NoSuchElementException("Underflow Exception");
	        return arr[top];
	}

	public boolean isFull() {
		// TODO Auto-generated method stub
		return top == size -1 ; 
	}

	public int getSize() {
		// TODO Auto-generated method stub
		 return len ;
	}

	public void display() {
		// TODO Auto-generated method stub
		 System.out.print("\nStack = ");
	        if (len == 0)
	        {
	            System.out.print("Empty\n");
	            return ;
	        }
	        for (int i = top; i >= 0; i--)
	            System.out.print(arr[i]+" ");
	        System.out.println();
	}

}
