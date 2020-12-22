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
        return data.length > row;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int rst = data[row][column++];
        if (data[row].length == column) {
            row++;
            column = 0;
        }
        return rst;
    }
}
