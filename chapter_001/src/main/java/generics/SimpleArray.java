package generics;

import java.util.*;

import it.SimpleIterator;

/**
 * Class SimpleArray
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 23.12.2020
 */
public class SimpleArray<T> implements Iterable<T> {
    private Object[] array;
    private int index = 0;

    public SimpleArray(int size) {
        this.array = new Object[size];
    }

    public void add(T model) {
        if (array.length == index) {
            throw new IndexOutOfBoundsException();
        }
        this.array[index++] = model;
    }

    public void set(int position, T model) {
        if (position < 0 || position >= index) {
            throw new IndexOutOfBoundsException();
        }
        this.array[position] = model;
    }

    public void remove(int position) {
        if (position < 0 || position >= index) {
            throw new IndexOutOfBoundsException();
        } else if (position == index - 1) {
            this.array[index - 1] = null;
        } else {
            System.arraycopy(this.array, position + 1, this.array, position, index - position - 1);
        }
        index--;
    }

    public T get(int position) {
        if (position < 0 || position >= index) {
            throw new IndexOutOfBoundsException();
        }
        return (T) this.array[position];
    }

    @Override
    public Iterator<T> iterator() {
        return new SimpleIterator<>(this.array);
    }
}
