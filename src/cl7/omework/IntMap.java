package cl7.omework;

public interface IntMap<K,V>  {
    void clear();

    boolean containsKey(Object key);

    boolean containsValue(Object value);

    int get(Object key);

    boolean isEmpty();

    int put(K key, V value);

    int remove(Object key);

    int size();
}
