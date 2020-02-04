import java.util.LinkedList;

public class LinkedListExamples {

    private final static class MyLinkedList<E>{

        private final class Node<E>{//12 bytes

            private Node<E> previous,next;// 4 + 4 bytes
            private E e;// 4 bytes , total = 24 bytes

            public Node(E e) {
                this.e = e;
            }
        }

        private Node<E> head;
        private Node<E> tail;

        public void add(E e){

            if(head == null){
                head = tail = new Node<>(e);
            }else{
                Node<E> node = new Node<>(e);
                node.previous = tail;
                tail.next = node;
                tail = node;
            }

        }


    }

    public static void main(String[] args) {
        LinkedList<Integer> queue = new LinkedList<>(); // almost never use this class
    }
}
