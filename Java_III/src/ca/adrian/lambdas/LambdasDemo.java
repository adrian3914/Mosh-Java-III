package ca.adrian.lambdas;

public class LambdasDemo {
    String  prefix = "-";

    public void show(){
        // Passing Lambda expression as an argument to a method
        greet(message -> System.out.println(this + message));
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