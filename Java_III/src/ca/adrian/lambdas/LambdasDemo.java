package ca.adrian.lambdas;

public class LambdasDemo {
    public LambdasDemo(String message) {
    }

    public static void show(){
        greet(message -> new LambdasDemo(message));
        greet(LambdasDemo::new);
    }

    public static void greet(Printer printer){
        printer.print("Hello World!");
    }
}

/*
    Anonymous class to implement interface in the function without the need of creating a class that implements it.
    greet(new Printer() {
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        });
 */

/*
        // Passing Lambda expression as an argument to a method
        greet(message -> System.out.println(this + message));

        // Initializing Variable Interface
        Printer printer = message -> System.out.println(message);
        printer.print("Hello!");
 */

/*
        // Converting lambda to method reference
        greet(message -> System.out.println(message));
        // Method reference
        greet(System.out::println);
        // Class/Object::method

        // This two lines are the same

        -------------------------------------------------------------
        // Accessing method in the class
       public void print(String message){}// Matches the signature of the print() in the Printer interface

       public static void show(){
       var demo = new LambdasDemo();
       greet(message -> System.out.println(message));
       greet(demo::print);
    }
 */