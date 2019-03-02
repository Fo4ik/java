package cl10;

public class Main {

    public static int count = 0;

    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.start();
        for (int i = 0; i < 4; i++) {
            startNewThread();
        }
        try {
            Thread.sleep(135) ; //136
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(count);


    }

    public static void startNewThread() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000000; i++) {
                    incCount();
                }
            }
        }).start();
    }

    private static synchronized void incCount(){
        count++;
    }
}