package generics;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.junit.Assert.*;
/**
 * Class RoleStoreTest
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 23.12.2020
 */
public class RoleStoreTest {
    private RoleStore list;

    @Before
    public void init() {
        list = new RoleStore(4);
    }

    @Test
    public void add() {
        list.add(new Role("Manager"));
        Role result = this.list.findById("Manager");
        assertThat(result.getId(), is("Manager"));
    }

    @Test
    public void replace() {
        list.add(new Role("Manager"));
        boolean result = this.list.replace("Manager", new Role("Programmer"));
        Role user = this.list.findById("Programmer");
        assertTrue(result);
        assertThat(user.getId(), is("Programmer"));
    }

    @Test
    public void delete() {
        list.add(new Role("Manager"));
        Role result = this.list.findById("Manager");
        assertThat(result.getId(), is("Manager"));
    }

    @Test
    public void findById() {
        list.add(new Role("Manager"));
        Role result = this.list.findById("Manager");
        assertThat(result.getId(), is("Manager"));
    }
}