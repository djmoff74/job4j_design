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

    private Object[] arr;
    private int countMod = 0;
    private int index = 0;

    public SimpleArray(int size) {
        this.arr = new Object[size];
    }

    public int getIndex() {
        return index;
    }

    public int getLength() {
        return arr.length;
    }

    public T get(int index) {
        return (T) arr[Objects.checkIndex(index, this.index)];
    }

    public void add(T model) {
        checkLength();
        arr[index] = model;
        countMod++;
        index++;
    }
public void set(int position, T model) {
    if (position < 0 || position >= index) {
        throw new IndexOutOfBoundsException();
    }
    this.arr[position] = model;
}
    public void remove(int position) {
        if (position < 0 || position >= index) {
            throw new IndexOutOfBoundsException();
        } else if (position == index - 1) {
            this.arr[index - 1] = null;
        } else {
            System.arraycopy(this.arr, position + 1, this.arr, position, index - position - 1);
        }
        index--;
    }

    public Object[] checkLength() {
        if (this.index == arr.length) {
            arr = Arrays.copyOf(this.arr, arr.length * 2);
        }
        return this.arr;
    }

    @Override
    public Iterator<T> iterator() {
        return new SimpleIterator<T>(this);
    }
}
