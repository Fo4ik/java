package cl7.omework;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IntHashMap implements IntMap {
    Map map = new HashMap();
    private int modCount;
    private int size = 0, lenght = 1;
    private int key[] = new int[lenght];
    private int value[] = new int[lenght];
    public int keyChecker[] = key;


    @Override
    public void clear() {

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


    public int[] put(int Value, int Key) {
        for (int i = 0; i < lenght; i++) {
            if (Hash()==true) {
                System.out.println("Ok");
            } else {
                size++;
                this.value[i] = Value;
                this.key[i] = Key;
                ToString();
                i++;
                lenght++;
                return this.value;
            }
        }
        return this.key;
    }

    public Boolean Hash() {
        for (int i = 0; i < size; i++) {
            if(key.equals(key[i])){
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }

    @Override
    public int remove(Object key) {
        return 0;
    }

    @Override
    public int size() {
        return size;
    }

    public void ToString() {
        System.out.println("IntHashMap " +
                "size=" + size +
                ", key=" + Arrays.toString(key) +
                ", value=" + Arrays.toString(value) + //);
                ", KeyChecker= " + Arrays.toString(keyChecker));
        if(Hash()==true){
        System.out.println("true");} else {
            System.out.println("False");
        }
    }


    public int get() {
        return 0;
    }


    //public key remove() {
    //    return null;
    //}


    @Override
    public int get(Object key) {
        return 0;

    }


}
