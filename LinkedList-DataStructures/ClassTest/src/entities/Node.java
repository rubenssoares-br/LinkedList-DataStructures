package entities;

public class Node {

    private String element;
    private Node next;

    public Node(String element, Node next) {
        this.element = element;
        this.next = next;
    }

    public Node(String element) {
        this.element = element;
        this.next = null;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
