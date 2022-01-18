package ca.adrian.collections;

import java.util.ArrayList;
import java.util.List;

public class MapDemo {

    public static void show(){
        List<Customer> customers = new ArrayList<>();

        // O(n)
        for (var customer: customers){
            if (customer.getEmail() == "e1")
                System.out.println("Found!");
        }

        // Using hasTables -> Maps will be a O(1)
    }
}
