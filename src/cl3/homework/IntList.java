package cl3.homework;

public interface IntList {


    void add(int value);

    void add(int index, int element);

    void clear();

    boolean contains(int value);

    int get(int index);

    boolean isEmpty();

    int remove(int index);

    void set(int index, int element);

    int size();

}


