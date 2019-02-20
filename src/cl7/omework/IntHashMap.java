package cl7.omework;


import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class IntHashMap<K, V> implements IntMap<K, V> {
    private Map Node = new HashMap<Integer, Integer>();
    private Node<K, V>[] table;
    private int modCount;
    private int size;


    @Override
    public void clear() {
        Node<K, V>[] tab;
        modCount++;
        if ((tab = table) != null && size > 0) {
            size = 0;
            for (int i = 0; i < tab.length; ++i)
                tab[i] = null;
        }
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }


    public boolean containsKey() {

        return false;

    }


    public boolean containsValue() {
        return false;
    }


    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public int put(K key, V value) {
        return 0;
    }


    public int put(Object key) {
        return 0;
    }

    @Override
    public int remove(Object key) {
        return 0;
    }

    @Override
    public int size() {
        return size();
    }


    public int get() {
        return 0;
    }


    public V remove() {
        return null;
    }

    public static class Node<K, V> implements Map.Entry<K, V> {
        final int hash;
        final K key;
        V value;
        Node<K, V> next;

        Node(int hash, K key, V value, Node<K, V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public final K getKey() {
            return key;
        }

        public final V getValue() {
            return value;
        }

        public final String toString() {
            return key + "=" + value;
        }

        public final int hashCode() {
            return Objects.hashCode(key) ^ Objects.hashCode(value);
        }

        public final V setValue(V newValue) {
            V oldValue = value;
            value = newValue;
            return oldValue;
        }

        public final boolean equals(Object o) {
            if (o == this)
                return true;
            if (o instanceof Map.Entry) {
                Map.Entry<?, ?> e = (Map.Entry<?, ?>) o;
                if (Objects.equals(key, e.getKey()) &&
                        Objects.equals(value, e.getValue()))
                    return true;
            }
            return false;
        }
    }

    @Override
    public int get(Object key) {
        return 0;

    }

}
