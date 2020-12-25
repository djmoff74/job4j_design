package generics;

/**
 * Class UserStore
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 25.12.2020
 */
public class UserStore implements Store<User> {
    private final Store<User> store =  new MemStore<User>();

    public UserStore(int i) {

    }

    @Override
    public void add(User model) {
        store.add(model);
    }

    @Override
    public boolean replace(String id, User model) {
        return store.replace(id, model);
    }

    @Override
    public boolean delete(String id) {
        return store.delete(id);
    }

    @Override
    public User findById(String id) {
        return store.findById(id);
    }
}
