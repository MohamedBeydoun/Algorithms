/**
 * SLinkedList: generic singly linked list
 */
public class SLinkedList {

    // node inner class
    private class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E element) {
            this.element = node;
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

    // getNode method returns the node at a certain index
    public Node<E> getNode(int i) {
        if (i < 0 || i >= size) {
            throw new IllegalArgumentException();
        } else {
            // start looking from head with index j until i-1
            Node<E> currentNode = head;
            int j = 0;
            while (j < i) {
                currentNode = currentNode.next;
                j++;
            }

            return currentNode;

        }
    }

    // setNode method sets the node at specified index
    // and returns the previous value
    public E setNode(int i, E newElement) {
        if (i < 0 || i >= size) {
            throw new IllegalArgumentException();
        } else {
            Node<E> oldNode = getNode(i);
            E oldNodeElement = oldNode.element;

            // set to new element
            oldNode.element = newElement;
            return oldNodeElement;
        }

    }

    // method that checks if list is empty
    public boolean isEmpty() {
        return (size == 0);
    }

    // method to reset the list
    public void clear() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

}