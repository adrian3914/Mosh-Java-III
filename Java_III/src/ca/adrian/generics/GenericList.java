package ca.adrian.generics;

import java.util.Iterator;

public class GenericList<T> implements Iterable<T> {
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

    @Override
    public Iterator<T> iterator() {
        return new ListIterator(this);
    }

    private class ListIterator implements Iterator<T>{
        private GenericList<T> list;
        private int index;

        public ListIterator(GenericList<T> list){
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return (index < list.count);
        }

        @Override
        public T next() {
            return list.items[index++];
        }
    }
}
