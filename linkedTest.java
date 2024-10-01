public class linkedTest {

    public static void main(String[] args) {    
                // Create a linked list
                LinkedList linkedList = new LinkedList();
                
                // Create a linked list with initial value 10
                linkedList.createLinkedList(10);
                
                // Insert values into the linked list
                linkedList.insertInLinkedList(20, 1);
                linkedList.insertInLinkedList(30, 2);
                linkedList.insertInLinkedList(40, 1);
                
                // Traverse the linked list
                linkedList.traverseLinkedList();
                
                // Search for a node
                linkedList.searchNode(30);
                
                // Delete a node
                linkedList.deleteNode(2);
                
                // Traverse the linked list again
                linkedList.traverseLinkedList();
            }
        }