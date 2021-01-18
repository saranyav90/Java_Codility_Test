package question11;

public class MyLinkedList {

	private Node first; // ref to first link on list
	
	public MyLinkedList(){
        first = null;
 }
	/**
     * Insert New Node at first position
     */
	public void insertFirst(int data) {
		// TODO Auto-generated method stub
		Node newNode = new Node(data); //Creation of New Node.
        newNode.next = first;   //newLink ---> old first
        first = newNode;  //first ---> newNode
	}

	public void displayLinkedList() {
		// TODO Auto-generated method stub
		
	}
	public Node deleteSpecificNode(int deleteKey) throws LinkedListEmptyException {
		// TODO Auto-generated method stub
		//Case1: when there is no element in LinkedList
        if(first==null){  //means LinkedList in empty, throw exception.              
               throw new LinkedListEmptyException("LinkedList doesn't contain any Nodes.");
        }
        
        //Case2: when there is only one element in LinkedList- check whether we have to delete that Node or not.       
        if(first.data==deleteKey){ //means LinkedList consists of only one element, delete that.
               Node tempNode = first; // save reference to first Node in tempNode- so that we could return saved reference.
               first=first.next;
               System.out.println("Node with data="+tempNode.data+" was found on first and has been deleted.");
               return tempNode;  //return deleted Node.
        }
        
        //Case3: when there are atLeast two elements in LinkedList
        Node previous=null; 
        Node current=first;
        while(current!=null){
               if(current.data==deleteKey){
                     System.out.println("Node with data="+current.data+" has been deleted.");
                     previous.next=current.next; //make previous node's next point to current node's next.
                     return current;   //return deleted Node.
               }
               else{
                     if(current.next==null){ //Means Node wasn't found.
                            System.out.println("Node with data="+deleteKey+" wasn't found for deletion.");
                            return null;
                     }                 
                     previous=current;
                     current=current.next;   //move to next node.
               }
        }
        return null;   
	}
}
