package сl11;

import java.util.ArrayList;
import java.util.Arrays;

public class ex2 {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3};
        int arr2[] = {1, 4, 5};
        int arr3[] = {4, 5, 6};
        ArrayList<int[]> arrayList =new ArrayList<>();
        arrayList.add(arr1);
        arrayList.add(arr2);
        arrayList.add(arr3);

        for (int s[] : arrayList){
            for (int a:s){
                System.out.println(a);
            }
        }

        //Хотел сделать цикл который будет записывать все значения из массивов arr в массив allarr, и его отсортировать и вывести
    }
}
