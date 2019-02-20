package cl3.homework;


import java.util.Arrays;

public class IntArrayList implements IntList {

    private int[] List = new int[10];
    private int count = 0;

    @Override
    public void add(int value) {

        for (int i = 0; i < List.length + 1; i++) {

            if (List != null) {

                System.out.print(Arrays.toString(List));
                System.out.println();
                int newSize = List.length * 3 / 2 + 1;
                int[] List1 = new int[newSize];
                List1[i] = i;
                System.out.println(Arrays.toString(List1));
            }
        }
        // newSize = List.length * 3 / 2 + 1;
    }

    @Override
    public void add(int index, int element) {
        int[] List2 = List;
        List2[index] = element;
        for (int i = index; i < List2.length; i++) {
            List2[index + 1] = List2[i];
        }
    }

    @Override
    public void clear() {
        count = 0;

        for (int i = 0; i < List.length; i++) {

            List[i] = count;
        }

    }

    @Override
    public boolean contains(int value) {
        return List.equals(value);
    }

    @Override
    public int get(int index) {
        int index1 = List[index];
        return index1;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public int remove(int index) {
        int[] array = new int[List.length - 1];
        int i = 0;
        int x = 0;
        while (i < List.length) {
            if (List[i] == 3) i++;
            array[x] = List[i];
            i++;
            x++;
        }
        return 0;
    }

    @Override
    public void set(int index, int element) {
        List[index - 1] = element;
    }

    @Override
    public int size() {
        count = List.length;
        return count;
    }

    @Override
    public String toString() {
        return "IntArrayList{" +
                "List=" + Arrays.toString(List) +
                ", count=" + count +
                '}';
    }

}



