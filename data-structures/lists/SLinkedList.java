/**
 * SLinkedList
 */
public class SLinkedList {

    // node inner class
    private class Node<E> {
        private E node;
        private Node<E> next;

        public Node(E node) {
            this.node = node;
            next = null;
        }
    }

    // fields of a linked list
    private Node<E> head;
    private Node<E> tail;
    private int size;

    // constructor
    public SLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

}