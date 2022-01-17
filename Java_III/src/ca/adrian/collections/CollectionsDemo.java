package ca.adrian.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {

    public static void show(){
        // we can initialize Collection Interface by passing one of the classes that implement it.
        Collection<String> collection = new ArrayList<>();
        // adding one element at the time
        collection.add("a");
        collection.add("b");
        collection.add("c");

        // adding all element at the same time using Collections
        Collections.addAll(collection,"d","e");

        for (var item: collection){
            System.out.println(item);
        }
        // size method
        System.out.println("The size of the collection is: " + collection.size());

        // remove an object
        boolean isRemoved = collection.remove("e");
        System.out.println("Removed: " +  isRemoved);
        System.out.println(collection);

        // Existence of an item
        String str = "a";
        var result = collection.contains(str);
        System.out.println("Collection contains " + str + ": " + result);

        // Converting to Array
        // obj[]
        Object[] objectArray = collection.toArray();
        // String[]
        String[] stringArray = collection.toArray(new String[0]);

        // removed all items clear()
        collection.clear();
        System.out.println("Is Collection Empty: " + collection.isEmpty());
        System.out.println(collection);

        // Comparing two collections
        Collection<String> other = new ArrayList<>();
        // adding all item from collection to other
        collection.addAll(collection);

        System.out.println(collection == other);
        System.out.println(collection.equals(other));
    }

}
