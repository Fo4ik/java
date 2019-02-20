package cl1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class ex9 {
    public static void main(String[] args) {
        String test = "22.01.2019 20:15:30";
        try {
            SimpleDateFormat formatIn = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
            Date date = formatIn.parse(test);
            SimpleDateFormat formatOut = new SimpleDateFormat("dd MMM, HH:mm a", Locale.US);
            String result = formatOut.format(date);
            System.out.println(result);
        } catch (ParseException e) {
            System.out.println("Недопустимый формат даты");
        }
    }
}
