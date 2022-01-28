package ca.adrian;

import ca.adrian.executors.CompletableFuturesDemo;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        CompletableFuturesDemo.show();
    }
}

/*
    // Exceptions
     var account = new Account();
       String txt = "Hello";

        try {
            account.withDraw(10);
        } catch (AccountException e) {
            e.printStackTrace();
            var cause  = e.getCause().getMessage();
            System.out.println(cause);
        }
 */

/*
    // Poor man Solution

    var list = new List();
    list.add(Integer.valueOf(1));// we can pass primitive type cause the compiler will use its wrapper class and implicit cast it to its wrapper
    list.add("1");
    list.add(new User());

    // Problems with this implementation
    int number = (int) list.get(0);// must cast it to desired data type
    int number2 = (int) list.get(1);// We will get a ClassCastException if we provide the wrong data type
 */

/*
    // Generics
     var list = new GenericList<User>();
        list.add(new User());
        var user = list.get(0);


        Primitive types in Generic, we MUST use the wrapper classes
            int -> Integer
            float -> Float
            boolean -> Boolean

        GenericList<Integer> numbers = new GenericList<>();
        numbers.add(1); // Boxing
        int number = numbers.get(0); // Unboxing
 */

/*
    The Comparable<> Interface
      // Comparing two Users objects
        var user1 = new User(26);
        var user2 = new User(25);

       if (user1.compareTo(user2) < 0)
           System.out.println("user1 < user2");
       else if (user1.compareTo(user2) == 0)
           System.out.println("user1 = user2");
       else
           System.out.println("user 1 > user2");
 */

/*
    // Iterable Interface
    var list = new GenericList<String>();
      var iterator = list.iterator();
      list.add("a");
      list.add("b");
      list.add("c");

      // loop using iterator
        while (iterator.hasNext()){
            var current = iterator.next(); // it returns the current item and moves to the next
            System.out.println(current);

      }
 */

/*
        // Comparator Interface
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("b", "e3"));
        customers.add(new Customer("a", "e2"));
        customers.add(new Customer("c", "e1"));
        Collections.sort(customers, new EmailComparator());


        for (Customer c: customers){
            System.out.println(c);
        }
 */

/*
    // Queue interface
        Queue<String> queue = new ArrayDeque<>();
        queue.add("c");
        queue.add("a");
        // adding to a queue also we can use offer()
        queue.offer("b");
        // b -> a -> c

        // gets the element at the front but doesn't remove it
        var front = queue.peek();
        System.out.println(front);

        // remove and return the element at the front
        var removedC = queue.remove(); // throws exception if queue is empty
        queue.poll(); // return null if queue is empty
        System.out.println(queue);
 */

/*
    THREADS
     System.out.println("Active Threads: " + Thread.activeCount());
     System.out.println("Available Threads to JVM: " + Runtime.getRuntime().availableProcessors());
 */

