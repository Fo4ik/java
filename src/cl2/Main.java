package cl2;

public class Main {
    public static void main(String[] args) {

        int last = 100;

        for (int fir = 1; fir <= last; ++fir) {
            if (fir % 5 != 0 && fir % 3 != 0) {
                System.out.print(fir);
            }

            if (fir % 5 == 0) {
                System.out.print("hello");
            }

            if (fir % 3 == 0) {
                System.out.print("world");
            }

            if (fir % 5 == 0 && fir % 3 == 0) {
                System.out.print("hello world");
            }

        }

    }
}

