package сl11;

import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        String s = "     aefseg ga4yey e5ue".trim();

        System.out.println(reverse(s));
    }

    public static String reverse(String s) {
        if (s == null && s.isEmpty()) {
            throw new IllegalArgumentException();
        }
        String[] arr;
        for (int i = 0; i < s.length(); i++) {
            arr = s.split("\\s+");
            String tmp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tmp;
            StringBuilder sb = new StringBuilder(arr.length-1);
            for (String s1 : arr) {
                sb.append(s1);
                sb.append(" ");
            }
            String str = sb.toString();
            return str;
        }

        return null;
    }


}
