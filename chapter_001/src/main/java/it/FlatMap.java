package it;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

/**
 * Class FlatMap
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 22.12.2020
 */

    public class FlatMap<T> implements Iterator<T> {
    private final Iterator<Iterator<T>> data;
    private Iterator<T> cursor;

    public FlatMap(Iterator<Iterator<T>> data) {
        this.data = data;
    }

    @Override
    public boolean hasNext() {
        if (cursor != null && cursor.hasNext()) {
            return true;
        } else if (data.hasNext()) {
            cursor = data.next();
            return true;
        }
        return false;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return cursor.next();
    }
}
