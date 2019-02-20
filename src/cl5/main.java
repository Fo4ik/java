package cl5;

public class main {
    public static void main(String[] args) {
        int count =0;
        for (int i = 0; i < 500; i++) {
            if(i%2 ==0){
                count++;
            }
        }
        for (int i = 50; i < 1000; i++) {
            if(i%2 ==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
