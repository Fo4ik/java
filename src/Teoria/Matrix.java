package Teoria;

public class Matrix {
    public static void main(String[] args) {


        int array[][] = {{1, 2, 1},
                         {1, 2, 1},
                         {1, 2, 1}};
        int sum = 0;


        /*for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        System.out.println("Сумма всех элементов двумерного массива = " + sum);*/

        int [][] mas = array;
        int s = 0;
        int num =-1;
        for (int i = 0; i < 3; i++) {
            num=num+1;
        }
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                s=array[i][j];
                System.out.println(s);
            }
        }


    }

}

