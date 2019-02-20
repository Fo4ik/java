package cl2.homework;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter jewels type: 'abc' ");
        String jewels = s.nextLine();
        System.out.println("enter stones type: 'abc' ");
        String stones = s.nextLine();
        int result = numJewelsInStones(jewels, stones);
        System.out.println(result);


    }

    public static int numJewelsInStones(String jewels, String stones) {
        int result = 0;
        for (int i = 0; i < jewels.length(); i++) {
            if (jewels.charAt(i) != ' ') {
                for (int j = 0; j < stones.length(); j++)
                    if (stones.charAt(j) == jewels.charAt(i)) {
                        result += 1;
                    }
            }
        }
        return result;
    }
}




