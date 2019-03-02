package cl7.homework;

public class IntHashMapMe implements IntMap {

    private class Entry {    //почему тут класс?
        Integer key;
        Integer value;
        Entry next;

        private Entry(Integer key, Integer value) {
            this.key = key;
            this.value = value;
        }
    }

    private Entry[] list = new Entry[1];
    private int size;
    private double loadFactor = 0.75;
    private int newlist = (int) (loadFactor * list.length);

    @Override
    public void clear() {
        list = new Entry[1];
        size = 0;
    }

    @Override
    public boolean containsKey(Integer key) {
        return false;
    }

    @Override
    public boolean containsValue(Integer value) {
        return false;
    }

    @Override
    public int get(Integer key) {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void put(Integer key, Integer value) {


    }

    @Override
    public void remove(Integer key) {

    }

    @Override
    public int size() {
        return size;
    }

    private Entry findkey(int key){



        return null;
    }
}
