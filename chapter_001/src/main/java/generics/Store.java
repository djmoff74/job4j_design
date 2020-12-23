package generics;

/**
 * Class Store
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 23.12.2020
 */
public interface Store<T extends Base> {

    void add(T model);

    boolean replace(String id, T model);

    boolean delete(String id);

    T findById(String id);
}
