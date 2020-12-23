package it;

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
    private final Object[] array;
    private int index = 0;

    public SimpleIterator(final Object[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return this.array.length > index;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return (T) this.array[index++];
    }
}
