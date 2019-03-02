package cl7.homework;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IntHashMap implements IntMap {

    private class Entry {    //почему тут класс?
        Integer key;
        Integer value;
        Entry next;

        private Entry(Integer key, Integer value) {
            this.key = key;
            this.value = value;
        }
    }

    private Entry[] table = new Entry[1];
    private double loadFactor = 0.75;
    private int threshold = (int) (loadFactor * table.length);
    private int size;


    @Override
    public void clear() {
        table = new Entry[1];
        size = 0;
    }

    @Override
    public boolean containsKey(Integer key) {
        Entry tmp = findEntry(key);
        return tmp != null;
    }

    @Override
    public boolean containsValue(Integer value) {
        for (Entry entry : table) {
            if (entry != null) {
                Entry tmp = entry;
                while (tmp != null) {
                    if (tmp.value.equals(value)) {
                        return true;
                    }
                    tmp = tmp.next;
                }
            }
        }

        return false;
    }

    @Override
    public int get(Integer key) {
        Entry tmp = findEntry(key);
        if (tmp != null) {
            return tmp.value;
        } else {
            return -1;
        }
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void put(Integer key, Integer value) {
        Entry tmp = findEntry(key);
        if (tmp != null) {
            tmp.value = value;
        } else {
            addEntry(key, value);
            size++;

            if (size > threshold) {
                resize();
            }
        }
    }

    @Override
    public void remove(Integer key) {
        if (containsKey(key)) {
            int keyHash = indexFor(key, table);


            if (table[keyHash].key.equals(key)) {
                table[keyHash] = table[keyHash].next;
            } else {
                Entry previousEntry = table[keyHash];
                Entry nextEntry = table[keyHash].next;

                while (nextEntry != null) {
                    if (nextEntry.key.equals(key)) {
                        nextEntry = nextEntry.next;
                        previousEntry.next = nextEntry;
                    } else {
                        previousEntry = nextEntry;
                        nextEntry = nextEntry.next;
                    }
                }
            }

            size--;
        }
    }

    @Override
    public int size() {
        return size;
    }

   /* @Override
    public IntHashSet keySet() {
        IntHashSet keySet = new IntHashSet();

        for (Entry entry : table) {
            if (entry != null) {
                Entry tmp = entry;
                while (tmp != null) {
                    keySet.put(tmp.key);
                    tmp = tmp.next;
                }
            }
        }

        return keySet;
    }*/

    private int indexFor(int key, Entry[] table) {//Зачем он?
        return key & (table.length - 1);
    }

    private void addEntry(Integer key, Integer value) {
        Entry entry = new Entry(key, value);
        addToTable(entry, table);
    }

    private void addToTable(Entry entry, Entry[] table) {
        int keyHash = indexFor(entry.key, table);

        if (table[keyHash] == null) {
            table[keyHash] = entry;
        } else {
            entry.next = table[keyHash];
            table[keyHash] = entry;
        }
    }

    private Entry findEntry(int key) {
        int keyHash = indexFor(key, table);

        if (table[keyHash] != null && table[keyHash].key == key) {
            return table[keyHash];
        } else {
            Entry entry = table[keyHash];
            while (entry != null) {
                if (entry.key == key) {
                    return entry;
                }
                entry = entry.next;
            }
        }

        return null;
    }

    private void resize() {
        int newSize = table.length * 2;
        Entry[] newTable = new Entry[newSize];

        transfer(newTable);

        table = newTable;
        threshold = (int) (loadFactor * table.length);
    }

    private void transfer(Entry[] newTable) {
        for (Entry entry : table) {
            if (entry != null) {
                Entry tmp = entry;
                Entry tmpNext;

                while (tmp != null) {
                    tmpNext = tmp.next;
                    tmp.next = null;
                    addToTable(tmp, newTable);
                    tmp = tmpNext;
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Entry entry : table) {
            if (entry != null) {
                Entry tmp = entry;
                while (tmp != null) {
                    sb.append(tmp.key).append(" = ").append(tmp.value).append(", ");
                    tmp = tmp.next;
                }
            }
        }
        sb.delete(sb.length() - 2, sb.length());
        sb.append("]");

        return sb.toString();
    }
}
