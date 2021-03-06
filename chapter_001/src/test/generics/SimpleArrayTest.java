package generics;

import org.junit.Before;
import org.junit.Test;


import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Class SimpleArrayTest
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 23.12.2020
 */
public class SimpleArrayTest {
    private SimpleArray<Integer> list;

    @Before
    public void init() {
        list = new SimpleArray<>(4);
    }
    @Test
    public void checkAddAndGet() {
        list.add(12);
        Integer result = list.get(0);
        assertThat(result, is(12));
    }

    @Test
    public void setCheck() {
        list.add(12);
        list.add(10);
        list.set(0, 15);
        Integer result = list.get(0);
        assertThat(result, is(15));
    }

    @Test
    public void remove() {
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.remove(3);
        Integer result1 = list.get(1);
        Integer result3 = list.get(2);
        assertThat(result1, is(2));
        assertThat(result3, is(3));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void whenGetElementMoreThanLengthArray() {
        list.add(12);
        Integer result = list.get(4);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void whenSetElementMoreThanElementsOfArray() {
        list.add(12);
        list.set(1, 15);
    }
}