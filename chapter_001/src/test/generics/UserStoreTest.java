package generics;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Class UserStoreTest
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 23.12.2020
 */
public class UserStoreTest {
    private UserStore list;

    @Before
    public void init() {
        list = new UserStore(4);
    }

    @Test
    public void add() {
        list.add(new User("Fedor"));
        User result = this.list.findById("Fedor");
        assertThat(result.getId(), is("Fedor"));
    }

    @Test
    public void replace() {
        list.add(new User("Fedor"));
        boolean result = this.list.replace("Fedor", new User("Filip"));
        User user = this.list.findById("Filip");
        assertTrue(result);
        assertThat(user.getId(), is("Filip"));
    }

    @Test
    public void delete() {
        list.add(new User("Fedor"));
        User result = this.list.findById("Fedor");
        assertThat(result.getId(), is("Fedor"));
    }

    @Test
    public void findById() {
        list.add(new User("Fedor"));
        User result = this.list.findById("Fedor");
        assertThat(result.getId(), is("Fedor"));
    }
}