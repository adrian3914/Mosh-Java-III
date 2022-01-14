package ca.adrian;


import ca.adrian.generics.GenericList;
import ca.adrian.generics.Instructor;
import ca.adrian.generics.User;
import ca.adrian.generics.Utils;
import jdk.jshell.execution.Util;

public class Main {

    public static void main(String[] args) {
        User user1 = new Instructor(10);
        User user2 = new User(20);
        Utils.printUser(user2);

        var users = new GenericList<User>();
        Utils.printUsers(users);
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

