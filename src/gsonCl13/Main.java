package gsonCl13;


import org.jetbrains.annotations.NotNull;

public class Main {
    public static void main(String[] args) {
        String s = null;
        test(s);

    }


    //JetBrains annotation

    private static void test( String s) {
        System.out.println(s);
    }
}
