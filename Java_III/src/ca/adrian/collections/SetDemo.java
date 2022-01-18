package ca.adrian.collections;

import java.util.*;

public class SetDemo {

    public static void show(){
        Set<String> set1 = new HashSet<>();
        set1.add("is");
        set1.add("blue");
        set1.add("blue");
        //System.out.println(set1);

        // removing duplicates in oneline from a collection
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection, "a", "c", "b", "b");
        var set2 = removeDuplicates(collection);
        //System.out.println(set2);

        // Set operations
        Set<String> set3 = new HashSet<>(Arrays.asList("a", "b","c"));
        Set<String> set4 = new HashSet<>(Arrays.asList("b", "c", "d"));

        // UNION -> Combination of two Sets
//        set3.addAll(set4);
//        System.out.println(set 3);

        // INTERCEPTION -> it retains only items present on both sets
//       set3.retainAll(set4);
//       System.out.println(set3);

        // DIFFERENCE -> it removes all items that both set contains
        set3.removeAll(set4);
        System.out.println(set3);

    }

    public static <T> Set<T> removeDuplicates(Collection<T> collection){
      Set<T> set = new HashSet<>();
      set.addAll(collection);
      return set;
    }

}
