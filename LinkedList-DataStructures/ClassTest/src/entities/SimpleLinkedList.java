package entities;

public class SimpleLinkedList {

    private Node head;
    private Node tail;
    private long size;


    public SimpleLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void addFirst(Node newHead) {
        newHead.setNext(head);
        if (size == 1) {
            tail = head;
        }
        head = newHead;
        size++;
    }

    public void addLast(Node newTail) {
        if (head == null) {
            head = newTail;
        }
        tail.setNext(newTail);
        tail = newTail;
        size++;
    }

    public void insertAfter(Node existing, Node newMiddle) {
        newMiddle.setNext(existing.getNext());
        existing.setNext(newMiddle);
        size++;
    }

    public void removeLast() {
        Node current = head;
        while (current.getNext() != tail) {
            current = current.getNext();
        }
        current.setNext(null);
        size--;
    }

    public void removeFirst() {
        Node n = head;
        head = head.getNext();
        n.setNext(null);
        size--;
    }

    public void removeAfter(Node existing, Node removeMiddle) {
        existing.setNext(removeMiddle.getNext());
        removeMiddle.setNext(null);
        size--;
    }


    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder();
       Node current = head;
       while (current != null) {
           sb.append(current.getElement()).append(" -> ");
           current = current.getNext();
       }
        return sb.toString();
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public long getSize() {
        return size;
    }
}
