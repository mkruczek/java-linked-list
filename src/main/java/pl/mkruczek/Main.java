package main.java.pl.mkruczek;

import main.java.pl.mkruczek.model.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = new List<>();

        list.add(15);
        list.add(30);
        list.add(45);
        System.out.println(list.size());
        System.out.println(list.toString());

        list.insert(1000, 2);
        System.out.println(list.size());
        System.out.println(list.toString());

        list.deleteAtIndex(0);
        System.out.println(list.size());
        System.out.println(list.toString());

        list.delete(1000);
        System.out.println(list.size());
        System.out.println(list.toString());
    }
}
