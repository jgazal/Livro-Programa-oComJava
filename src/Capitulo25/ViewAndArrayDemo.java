package Capitulo25;

// Tente Isto 25-1

import java.util.*;

public class ViewAndArrayDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        String[] array = list.toArray(new String[4]);
        List<String> sublist = list.subList(0,4);

        array[1] = "F";
        sublist.set(2,"O");
        System.out.println(list);
    }
}
