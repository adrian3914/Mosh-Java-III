package ca.adrian.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void show(){
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        // adding an item in a specific index
        list.add(0,"!");

        Collections.addAll(list, "d","e","e");

        System.out.println(list);

        // getting an item by index
        var itemByIndex = list.get(1);
        System.out.println(itemByIndex);

        // replacing an object at given index
        String itemReplaced = list.set(1,"A");
        System.out.println(itemReplaced);

        // removed by index
        System.out.println("removing item by index");
        list.remove(3);
        System.out.println(list);

        // indexOf()
        System.out.println("indexOf() returns the index of a the first occurrence of given item, if no found returns -1");
        System.out.println("The index of first occurrence of A is: " + list.indexOf("A"));

        // lastIndexOf()
        System.out.println("lastIndexOf() returns the index of a the last occurrence of given item, if no found returns -1");
        System.out.println("The index of last occurrence of e is: " + list.lastIndexOf("e"));

        // subList()
        System.out.println("subList(int fromIndex, int toIndex) returns a new list within the indexes specified");
        System.out.println(list.subList(0,3));


    }
}
