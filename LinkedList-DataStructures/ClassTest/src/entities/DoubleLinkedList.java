package entities;

public class DoubleLinkedList {

    private Dnode head;
    private Dnode tail;
    private long size;

    public DoubleLinkedList() {
        head = new Dnode(null, null, null);
        tail = new Dnode(null, null, null);
        head.setNext(tail);
        size = 0;
    }

    public void addFirst(Dnode newHead) {
        Dnode x = head.getNext();
        newHead.setNext(x);
        newHead.setPrev(head);
        x.setPrev(newHead);
        head.setNext(newHead);
        size++;
    }

    public void addLast(Dnode newLastElement) {
        Dnode y = tail.getPrev();
        newLastElement.setNext(tail);
        newLastElement.setPrev(y);
        y.setNext(newLastElement);
        tail.setPrev(newLastElement);
        size++;
    }

    public void insertAfter(Dnode existing, Dnode newMiddle) {
        newMiddle.setNext(existing.getNext());
        newMiddle.setPrev(existing);
        existing.setNext(newMiddle);
        existing.getNext().setPrev(newMiddle);
        size++;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Dnode current = head.getNext();
        sb.append("[.] -> ");
        while (current.getNext()!=null) {
            sb.append(" <- ");
            sb.append(current.getElement());
            sb.append(" -> ");
            current = current.getNext();
        }
        sb.append(" <- [.]");
        return sb.toString();
    }

}
