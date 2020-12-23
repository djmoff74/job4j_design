package generics;

/**
 * Class RoleStore
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 23.12.2020
 */
public class RoleStore extends MemStore<Role> {

    public RoleStore(int size) {
        super(size);
    }
}
