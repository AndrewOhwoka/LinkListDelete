public class linkedTest {

    public static void main(String[] args) {    
                // Create a linked list
                LinkedList linkedList = new LinkedList();
                
                // Create a linked list with initial value 10
                linkedList.createLinkedList(10);
                
                // Insert values into the linked list
                linkedList.insertInLinkedList(20, 1);
                linkedList.insertInLinkedList(30, 2);
                linkedList.insertInLinkedList(40, 3);
                linkedList.insertInLinkedList(50, 4);
                
                // Traverse the linked list
                System.out.println("Initial Linked List:");
                linkedList.traverseLinkedList();
                
                // Delete the first node
        linkedList.deleteNode(0);
        System.out.println("After deleting the first node:");
        linkedList.traverseLinkedList();
        
        // Delete the last node
        linkedList.deleteNode(linkedList.size - 1);
        System.out.println("After deleting the last node:");
        linkedList.traverseLinkedList();
        
        // Delete a node in the middle
        linkedList.deleteNode(1);
        System.out.println("After deleting a node in the middle:");
        linkedList.traverseLinkedList();
     } 
    }
    