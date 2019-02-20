package cl6.homework;

import java.util.*;

public class ex1 {
    public static void main(String[] args) {
        String[] stringemails = {"tes.t@gmail.com", "test@gmail.com", "t+est@gmail.com"};
        System.out.println(Arrays.toString(stringemails));
        System.out.println( IntEmails(stringemails));
    }

    private static int IntEmails(String[] emails) {
        String[] ArrayEmails = new String[emails.length];
        for (int i = 0; i < ArrayEmails.length; i++) {
            ArrayEmails[i] = emails[i].substring(0, emails[i].indexOf("@"));
        }
        for (int i = 0; i < ArrayEmails.length; i++) {
            if (ArrayEmails[i].contains(".")) {
                ArrayEmails[i] = ArrayEmails[i].replace(".", "");
            }
            if (ArrayEmails[i].contains("+")) {
                ArrayEmails[i] = ArrayEmails[i].substring(0, ArrayEmails[i].indexOf("+"));
            }
            ArrayEmails[i] = ArrayEmails[i] + emails[i].substring(emails[i].indexOf("@"));
        }
        System.out.println(Arrays.toString(ArrayEmails));
        Set<String> emailsSet = new HashSet<>();
        emailsSet.addAll(Arrays.asList(ArrayEmails));
        return emailsSet.size();
    }

}
