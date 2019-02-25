package cl7.omework;

public interface IntMap {
    void clear();

    boolean containsKey(Object key);

    boolean containsValue(Object value);

    int get(Object key);

    boolean isEmpty();

    int[] put(int key, int value);

    int remove(Object key);

    int size();


}
