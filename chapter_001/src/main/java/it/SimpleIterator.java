package it;

import generics.SimpleArray;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Class SimpleIterator
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 23.12.2020
 */
public class SimpleIterator<T> implements Iterator<T> {
    private final SimpleArray<T> arrToIterate;
    private final int arrPosition;
    private int counter = 0;


    public SimpleIterator(final SimpleArray<T> arr) {
        arrToIterate = arr;
        arrPosition = arr.getIndex();
    }

    @Override
    public boolean hasNext() {
        if (arrPosition != arrToIterate.getIndex()) {
            throw new ConcurrentModificationException();
        }
        return counter < arrPosition;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw  new NoSuchElementException();
        }

        T element = arrToIterate.get(counter);
        this.counter++;
        return element;
    }
}
