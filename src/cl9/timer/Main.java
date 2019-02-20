package cl9.timer;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        int seconds = 0, minutes = 0, hour = 0;
        while (true) {
            Thread.sleep(1000);
            seconds++;

            if (minutes == 0) {
                System.out.print("Hour: " + hour + " Minutes: " + minutes + " Seconds :");

            }

            if (minutes != 0)
                System.out.print("Hour: " + hour + " Minutes: " + minutes + " Seconds :");
                System.out.println(seconds);
            if (seconds == 59) {
                seconds = -1;
                minutes++;
            }
            if (minutes == 59) {
                minutes = -1;
                hour++;
            }
        }
    }
}
