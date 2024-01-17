package by.academy.homework4.task4;


import java.util.Iterator;

public class TaskIterator<T> implements Iterator<T> {

    private T[] array;
    private int index;

    public TaskIterator() {
        super();
    }

    public TaskIterator(T[] array) {
        this.array = array;
    }

    @Override
    public T next() {
        return array[index++];
    }

    @Override
    public boolean hasNext() {
        if (array == null || array.length <= index) {
            return false;
        }
        return array[index] != null;
    }
}

