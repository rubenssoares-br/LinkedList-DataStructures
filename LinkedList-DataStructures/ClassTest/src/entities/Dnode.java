package entities;

public class Dnode {

    private String element;
    private Dnode next;
    private Dnode prev;

    public Dnode(String element, Dnode next, Dnode prev) {
        this.element = element;
        this.next = next;
        this.prev = prev;
    }

    public Dnode getPrev() {
        return prev;
    }

    public void setPrev(Dnode prev) {
        this.prev = prev;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public Dnode getNext() {
        return next;
    }

    public void setNext(Dnode next) {
        this.next = next;
    }
}
