package ca.adrian.lambdas;

import java.util.function.*;

public class LambdasDemo {

    public static void show(){
        // UnaryOperator Interface extends Function<T, T>
        UnaryOperator<Integer> square = n -> n * n;
        UnaryOperator<Integer> increment = n -> n + 1;

        var result = increment.andThen(square).apply(1);
        System.out.println(result);

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

/*
    // Consumer Interface example - abstract method accept(T t);
        List<Integer> list = List.of(1, 2 , 3);

        // Imperative programming (for. if/else, switch/case)
        for (Integer item: list)
            System.out.println(item);

        // Declarative programming
        // forEach expects a Consumer
        // Lambda Expression
        list.forEach(item -> System.out.println(item));

        // Method referencing
        list.forEach(System.out::println);

        // ---------------------------------------------------------------------

     // Consumer Interface - chaining consumers default method andThen(Consumer<? super T> after)
        List<String> list = List.of("a", "b", "c");
        Consumer<String> print = item -> System.out.print(item);
        Consumer<String> printUpperCase = item -> System.out.print(item.toUpperCase());

        // forEach expects a consumer Object Consumer<? super String>
        list.forEach(print.andThen(printUpperCase).andThen(print));
 */

/*
     // Specialization of the supplier Interface to work with primitive types
        DoubleSupplier doubleSupplier = () -> Math.random();
        IntSupplier intSupplier = () -> 12;
        LongSupplier longSupplier = () -> 12L;
        BooleanSupplier booleanSupplier = () -> true;

        // Supplier Interface
        Supplier<Double> getRandom = () -> Math.random();

        // Calling the supplier, at this point it will provide a value
        var random  = getRandom.get();
        System.out.println(random);
 */

/*
      // The Function Interface Function<T, R>
        // T -> input , R -> Return
        Function<String, Integer> map = str -> str.length();
        var length = map.apply("Adrian");
        System.out.println(length);
 */

/*
        // Composing functions
        // input: "key:value"
        // first: "key=value"
        // second: {key=value}
        String input = "key:value";
        Function<String, String> replaceColon = inputStr -> inputStr.replace(':', '=');
        Function<String, String> addBraces = inputStr -> "{" + inputStr + "}";

        // Declarative Programming
        // andThen()
        var result = replaceColon
                .andThen(addBraces)
                .apply(input);

        // compose()
        result = addBraces.compose(replaceColon).apply(input);

        System.out.println(result);
 */

/*
     // The Predicate interface -> use for filtering or checking
     // "Sky"
        Predicate<String> isLongerThan5 = str -> str.length() > 5;
        var result = isLongerThan5.test("sky");
        System.out.println(result);

        // Combining predicates
        Predicate<String> hasLeftBrace = str -> str.startsWith("{");
        Predicate<String> hasRightBrace = str -> str.endsWith("}");
        Predicate<String> hasLeftAndRightBrace = hasLeftBrace.and(hasRightBrace);

        var result = hasLeftAndRightBrace.test("{Hello World!}");
        System.out.println(result);
 */

/*
        // BinaryOperator interface
        // a, b -> a+b -> square
        BinaryOperator<Integer> sum = (a, b) -> a + b;
        Function<Integer, Integer> square = a -> a * a;

        var result  = sum.andThen(square).apply(2,1);
        System.out.println(result);
 */