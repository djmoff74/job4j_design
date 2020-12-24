package it;

import java.util.*;
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
        this.cursor = Collections.emptyIterator();
    }

    @Override
    public boolean hasNext() {
        while (data.hasNext() && !cursor.hasNext()) {
            cursor = data.next();
        }
        return cursor.hasNext();
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return cursor.next();
    }
}
