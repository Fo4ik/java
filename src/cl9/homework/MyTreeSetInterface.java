package cl9.homework;

public interface MyTreeSetInterface<T> {

    void add(T key);

    void clear();

    boolean isEmpty();

    boolean contains(T key);

    void remove(T key);

    int size();

}
