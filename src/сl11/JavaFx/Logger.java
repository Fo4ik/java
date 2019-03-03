package сl11.JavaFx;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {

    private static final DateTimeFormatter FORMAT = DateTimeFormatter.ofPattern("dd-MM HH:mm:ss.SSS");

    public static void log(String message) {
        System.out.println(LocalDateTime.now().format(FORMAT) + " Test: " + message);
    }

    public static void log(int message) {
        Logger.log(String.valueOf(message));
    }

}
