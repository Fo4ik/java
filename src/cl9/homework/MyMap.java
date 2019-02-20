package cl9.homework;

public interface MyMap<K, V> {
    void put(K key, V value);

    V get(K key);

    void clear();

    boolean containsKey(K key);

    boolean containsValue(V value);

    V 	remove( K key);

    int size();




}

