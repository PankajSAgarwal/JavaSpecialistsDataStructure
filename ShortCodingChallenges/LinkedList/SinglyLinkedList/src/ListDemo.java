public class ListDemo {

    public static void main(String[] args) {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        sll.printList();

        //sll.insertAtEnd(0);
        //sll.printList();

       /* for (int i = 1; i <10 ; i++) {
            sll.insertAtHead(i);
          //  sll.printList();
        }*/

        /*for (int i = 1; i <3 ; i++) {
            sll.insertAtEnd(i);
            sll.printList();
        }*/

        /*for (int i = 0; i <5 ; i++) {
            sll.insertAtEnd(i);
            //sll.printList();
        }*/
        sll.insertAtEnd(3);
        sll.insertAtEnd(2);
        sll.insertAtEnd(1);
        sll.insertAtEnd(0);

        sll.printList();
        //sll.insertAtEnd(3);
        //System.out.println ("\nInserting 8 after 2");
        //sll.insertAfter(8,2);
        //sll.printList();
//        System.out.println ("\nInserting 10 after 3");
//        sll.insertAfter (10, 3);   // calling insert after
       // System.out.println(sll.searchNode(5));
        //sll.printList();
        //sll.deleteAtHead();

        sll.deleteByValue(1);
        sll.printList();
    }
}
