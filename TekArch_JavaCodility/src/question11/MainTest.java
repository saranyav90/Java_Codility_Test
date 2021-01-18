package question11;

import java.util.LinkedList;

/*
 * 11. Write a java program to implement your own singly linked list in which delete method deletes 
 * 		a given element in the singly linked list
 * 
 */
public class MainTest {

	public static void main(String[] args) throws LinkedListEmptyException {
		// TODO Auto-generated method stub
		MyLinkedList linkedList = new MyLinkedList(); // creation of Linked List
		
		linkedList.insertFirst(92);
        linkedList.insertFirst(20);
        linkedList.insertFirst(19);
        linkedList.insertFirst(29);
        linkedList.displayLinkedList(); // display LinkedList
        
        linkedList.deleteSpecificNode(29);
        linkedList.deleteSpecificNode(11);
        linkedList.displayLinkedList(); //Again display LinkedList
	}

}
