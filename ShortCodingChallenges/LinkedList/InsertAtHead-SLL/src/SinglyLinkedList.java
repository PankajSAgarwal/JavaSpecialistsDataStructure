public class SinglyLinkedList<T> {
    //Node inner class for SLL
    public class Node{
        public T data;
        public Node nextNode;
    }
    public Node headNode;//head node of the linked list
    public int size;//size of the linked list

    //Constructor - initializes headNode and size
    public SinglyLinkedList(){
        headNode = null;
        size = 0;
    }

    // Helper Function to Check if the list is empty

    public boolean isEmpty(){

        if (headNode == null)
            return true;
        return false;
    }

    //Inserts new data at the start of the linked list

    public void insertAtHead(T data){
        //Creating a new node and assigning it the new data value
        Node newNode = new Node();
        newNode.data = data;
        //Linking head to the newNode's nextNode
        newNode.nextNode = headNode;
        headNode = newNode;
        size++;
    }

    // Inserts new data at the end of the linked List

    public void insertAtEnd(T data){
        //Creating a new Node with value data
        Node newNode = new Node();
        newNode.data = data;
        newNode.nextNode = null;
        //if the list is empty then call insertATHead()
        if(isEmpty()){
            insertAtHead(data);
            return;
        }

        Node last = headNode;
        //iterate to the last element
        while(last.nextNode != null){
            last = last.nextNode;
        }
        //make newNode the next element of the last node
        last.nextNode = newNode;
        size++;

    }

    // Inserts new node after a given node with a given data of the linked List

    public void insertAfter(T data, T previous){
        //Creating a new Node with value data
        Node newNode = new Node();
        newNode.data = data;

        //Start from head node
        Node currentNode = this.headNode;

        //traverse the list until node having data equal to previous is found
        while(currentNode!=null && !currentNode.data.equals(previous)){
            currentNode = currentNode.nextNode;
        }

        //if such a node was found
        //then point our newNode to currentNode's nextElement
        if(currentNode != null){
            newNode.nextNode = currentNode.nextNode;
            currentNode.nextNode = newNode;
             size++;
        }
    }
    // Helper function to print list

    public void printList(){

        if(isEmpty())
        {
            System.out.println("List is empty !");
            return;
        }

        Node temp = headNode;
        System.out.println("List : ");
        while(temp.nextNode != null){
            System.out.print(temp.data.toString() + "->");
            temp = temp.nextNode;
        }
        System.out.println(temp.data.toString() + "-> null");
    }


}
