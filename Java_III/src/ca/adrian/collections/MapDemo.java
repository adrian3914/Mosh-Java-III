package ca.adrian.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {

    public static void show(){

        var c1 = new Customer("a","e1");
        var c2 = new Customer("b","e2");

        //  Map Interface
        Map<String, Customer> map = new HashMap<>();

        // adding to our map
        map.put(c1.getEmail(), c1);
        map.put(c2.getEmail(), c2);

        // get customer by the key value, if customer does not exist, returns null
        var customer  = map.get("e1");
        System.out.println(customer);

        // get customer using getOrDefault(), returns the default value
        var customer2 = new Customer("Unknown","");
        var result = map.getOrDefault("e10", customer2);
        System.out.println(result);

        // containsKey() -> boolean
        var exists = map.containsKey("e1");
        System.out.println(exists);

        // Replacing an object in a hash table
        map.replace("e1", new Customer("a++", "e1"));
        System.out.println(map);

        // Looping in map. does not extends Iterable
        // Loop one using ketSet()
        for (String key: map.keySet()){
            System.out.println(key);
        }

        // Loop using entrySet() -> returns a set
        for (var entry: map.entrySet()){
            System.out.println(entry);
        }

        // Loop using values() -> returns a collection
        for (var c: map.values()){
            System.out.println(c);
        }
    }

}

// ------------------------------------------------------------------

/*
            List<Customer> customers = new ArrayList<>();

        // O(n)
        for (var customer: customers){
            if (customer.getEmail() == "e1")
                System.out.println("Found!");
        }

        // Using hasTables -> Maps will be a O(1)
 */
