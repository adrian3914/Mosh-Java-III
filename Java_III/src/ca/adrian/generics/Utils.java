package ca.adrian.generics;

public class Utils {

    // Non Generic
    public static int max(int first, int second){
        return (first > second)? first: second;
    }

    // To make it generic add <T> before the return type and change all type as T


    // Generic
    public static <T extends Comparable<T>> T max(T first, T second){
        return (first.compareTo(second) > 0)? first: second;
    }

    // Multiple Type Parameters
    /* Regular practice, we can call it whatever you want
        K = key
        V = Value
     */
    public static <K, V> void print(K key, V value){
        System.out.println(key + "=" + value);
    }

}
