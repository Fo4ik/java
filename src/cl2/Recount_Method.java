package cl2;

import java.util.Scanner;

public class Recount_Method {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        Permutade("", str);
    }

    private static void Permutade(String left, String right) {
        if (right.length()<=1){
            System.out.println(left+right);
        } else {
            for (int i = 0; i < right.length() ; i++) {
                char ch= right.charAt(i);
                String result = right.substring(0,i)+right.substring(i+1);
                Permutade(left+ch, result);
            }
        }
    }
}
