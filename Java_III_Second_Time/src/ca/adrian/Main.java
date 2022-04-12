package ca.adrian;

import ca.adrian.generics.GenericList;

public class Main {

    public static void main(String[] args) {
        // int -> Integer
        // float -> Float
        // boolean -> Boolean

        GenericList<Integer> numbers = new GenericList<>();
        numbers.add(1); // Boxing
        int number = numbers.get(0);// Unboxing
    }
}
