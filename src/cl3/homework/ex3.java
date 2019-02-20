package cl3.homework;

public class ex3 {
    public static void main(String[] args) {
        int array [][]= {{0,0,1} ,
                       {0,1,0} ,
                       {1,0,0}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = (array[i][j] == 1) ? 0 : 1;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
