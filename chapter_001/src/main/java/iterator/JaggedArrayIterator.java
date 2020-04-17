package iterator;

import java.util.Iterator;

/**
 * Class JaggedArrayIterator
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 17.04.2020
 */
public class JaggedArrayIterator implements Iterator {
    private final int[][] array;
    private int indexArray = 0;
    private int index = 0;

    public JaggedArrayIterator(int[][] array) {
        this.array = array;
    }


    @Override
    public boolean hasNext() {
        return array.length > indexArray;
    }

    @Override
    public Object next() {
        if (!hasNext()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int rst = array[indexArray][index++];
        if (array[indexArray].length == index) {
            indexArray++;
            index = 0;
        }
        return rst;
    }
}
