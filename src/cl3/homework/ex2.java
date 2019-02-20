package cl3.homework;

import java.util.Arrays;

public class ex2 {
    public static void main(String[] args) {
        int arr[] = {3, 2, 1, 4,7,7,6};
        int out[] = new int[arr.length];
        int o = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                out[o++] = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                out[o++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(out));
    }
}
