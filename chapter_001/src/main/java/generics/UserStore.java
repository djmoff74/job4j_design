package generics;

/**
 * Class UserStore
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 23.12.2020
 */
public class UserStore extends MemStore<User> {

    public UserStore(int size) {
        super(size);
    }
}