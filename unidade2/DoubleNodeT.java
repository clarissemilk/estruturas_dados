

public class DoubleNodeT {
    private T data;
    private DoubleNode<T> previous;
    private DoubleNode<T> next;
    private int value;

    public DoubleNode<T>(int value) {
        this.value = value;
        this.previous = null;
        this.next = null;
    }

    public DoubleNode<T> getPrevious() {
        return previous;
    }

    public void setPrevious<T>(DoubleNodeT previous) {
        this.previous = previous;
    }

    public DoubleNode<T> getNext() {
        return next;
    }

    public void setNext(DoubleNodeT next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }
    
}
