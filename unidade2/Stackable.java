package unidade2;

public interface Stackable {
    T pop();
    push(T data)
    void update(T newData);
    T peek();   

    boolean isEmpty();
    boolean isFull();
    String print();
}