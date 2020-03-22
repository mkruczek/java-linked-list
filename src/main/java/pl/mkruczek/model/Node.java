package main.java.pl.mkruczek.model;

class Node<T> {
    T data;
    Node next;

    Node(T data) {
        this.data = data;
        this.next = null;
    }

    @Override
    public boolean equals(Object t){
        return this.data.equals((T)t);
    }
}
