package it;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Class MatrixIt
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 22.12.2020
 */
public class MatrixIt implements Iterator<Integer> {
    private final int[][] data;
    private int row = 0;
    private int column = 0;

    public MatrixIt(int[][] data) {
        this.data = data;
    }

    @Override
    public boolean hasNext() {
        for (int i = row; i < data.length; i++) {
            if (data[row].length == 0) {
                row++;
            } else if (column == data[row].length) {
                column = 0;
                row++;
            }
        }
        return row < data.length;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }

        return data[row][column++];
    }
}
