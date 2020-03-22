package main.java.pl.mkruczek.model;

public class Node<T> {
    T data;
    Node next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    @Override
    public boolean equals(Object t){
        return this.data.equals((T)t);
    }
}
