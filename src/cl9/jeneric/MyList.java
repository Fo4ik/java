package cl9.jeneric;

public class MyList<T> {
// T - Jenerik


    private int size =0;

    private T [] arr = (T[]) new Object[size];

    public void add(T value){
        arr[size]= value;
        size++;
    }

    public T get(int index, T value){
        return arr[index];

    }



}
