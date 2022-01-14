package ca.adrian.generics;

public class GenericList<T> {
    // ClassName<T> Parameter for the class -> the type of object
    //<T> -> Type || Template
    //<E> -> Element, use it when we want to implement a class that acts as a collection

    private T[] items = (T[]) new Object[10]; // Initialize Object[] and cast it to T, since compiler does not know T until we initialize the class;
    private int count;

    public void add(T item){
        items[count++] = item;
    }

    public T get(int index){
        return items[index];
    }
}
