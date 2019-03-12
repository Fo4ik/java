package cl9.homework;

public interface MyTreeMapInterface<K, V> {

    void clear();

    boolean containsKey(K key);

    boolean containsValue(V value);

    V get(K key);

    void put(K key, V value);

    int size();

    void remove(K key);
}
