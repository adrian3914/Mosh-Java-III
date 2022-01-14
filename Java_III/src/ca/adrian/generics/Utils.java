package ca.adrian.generics;

public class Utils {

    // Generic
    public static <T extends Comparable<T>> T max(T first, T second){
        return (first.compareTo(second) > 0)? first: second;
    }

    // Non Generic
    public static int max(int first, int second){
        return (first > second)? first: second;
    }

    /*
        To make it generic add <T> before the return type and change all type as T
     */
}
