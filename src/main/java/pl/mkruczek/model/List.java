package main.java.pl.mkruczek.model;

public class List<T> {
    private Node header;
    private Node last;
    private int size;

    public List() {
        this.header = new Node(null);
        this.last = header;
        this.size = 0;
    }

    public List<T> add(T... t){
        for (T v : t) {
            this.add(v);
        }
        return this;
    }

    public List<T> add(T v) {
        Node n = new Node(v);
        if (size == 0) {
            this.header.next = n;
            this.last = n;
        } else {
            this.last.next = n;
            this.last = n;
        }
        this.size++;
        return this;
    }

    public List<T> insert(T t,int index) {
        if (index > this.size || header.next == null) {
            throw new IndexOutOfBoundsException();
        }
        int counter = 0;
        Node<T> tmp = header.next;
        while (true) {
            if (counter == index-1){
                Node<T> n = new Node<>(t);
                n.next = tmp.next;
                tmp.next = n;
                size++;
                break;
            }
            tmp = tmp.next;
            counter++;
        }
        return this;
    }

    public List<T> delete(T t) {
        if (header.next == null) {
            throw new IndexOutOfBoundsException();
        }

        if (header.next.equals(t)){
            Node<T> toDelete = header.next;
            header.next = toDelete.next;
            size--;
            return this;
        }

        int counter = 0;
        Node<T> tmp = header.next;
        while (true) {
            if (tmp.next.equals(t)){
                Node<T> toDelete = tmp.next;
                tmp.next = toDelete.next;
                size--;
                break;
            }
            tmp = tmp.next;
            counter++;
        }
        return this;
    }

    public List<T> deleteAtIndex(int index) {
        if (index > this.size || header.next == null) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            Node<T> toDelete = header.next;
            header.next = toDelete.next;
            size--;
            return this;
        }

        int counter = 0;
        Node<T> tmp = header.next;
        while (true) {
            if (counter == index-1){
                Node<T> toDelete = tmp.next;
                tmp.next = toDelete.next;
                size--;
                break;
            }
            tmp = tmp.next;
            counter++;
        }
        return this;
    }

    public int size() {
        return this.size;
    }

    public String toString(){
        String result = "";
        Node n = header.next;
        while (n.next != null){
            result += n.data + " ";
            n = n.next;
        }
        result += n.data;
        return result;
    }
}
