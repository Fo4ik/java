package cl4.homework;

import java.util.Arrays;

public class binarSearch {
    public static void main(String[] args) {
        int array[] = {0, 3, 1, 6, 2, 7, 2};
        int serchnum = 6;
        System.out.println(binarSearch(array, serchnum));
    }

    public static boolean binarSearch(int array[], int serchnum) {

        int first = 0;
        int last = array.length - 1;
        int position = (first + last) / 2;
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        while ((array[position] != serchnum) && (first <= last)) {

            if (array[position] > serchnum) {  // если число заданного для поиска
                last = position - 1; // уменьшаем позицию на 1.
            } else {
                first = position + 1;    // иначе увеличиваем на 1
            }
            position = (first + last) / 2;
        }
        if (first <= last) {
            System.out.println(serchnum + " является " + ++position + " элементом в массиве");
            return true;

        } else {
            System.out.println("Элемент не найден в массиве. ");
            return false;
        }


    }
}
