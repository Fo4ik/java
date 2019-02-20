package cl2.homework;


import java.util.Arrays;
import java.util.Scanner;

public class EX2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int arr[] = arrsqrt();
        System.out.println(Arrays.toString(arr));
    }

    private static int[] arrsqrt() {
        Scanner s = new Scanner(System.in);
        int raylangth = s.nextInt();
        int arr[] = new int[raylangth];
        int[] result = new int[arr.length];
        int a = 0;
        int b = arr.length - 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int squareA = arr[a] * arr[a];
            int squareB = arr[b] * arr[b];
            if (squareA > squareB) {
                result[i] = squareA;
                a++;
            } else {
                result[i] = squareB;
                b--;
            }
        }
        return result;
    }
}
