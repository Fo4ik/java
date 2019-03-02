package Teoria;

import java.util.*;


public class Main {


    public static void main(String[] args) {

        ArrayList<emails> List = new ArrayList<>();
        List.add(new emails("test1@gmail.com"));

        List.add(new emails("te.st@gmail.com"));

        List.add(new emails("tes2+st@gmail.com"));

        List.add(new emails("te.s2+t@gmail.com"));

        test(List);





    }


    public static void test(ArrayList<emails> emails) {

        for (int i = 0; i < emails.size(); i++) {

            String [] arrstring = new String[emails.size()];

            String string = String.valueOf(emails.get(i));

            int cheak = string.indexOf(".");

            int cheakplus = string.indexOf("+");



            if (cheak != -1) {
                if (cheakplus == -1) {

                    string = string.replace(".", "");

                   // System.out.println(string);
                    arrstring[i]=string;
                }
            }


            if (cheakplus != -1) {
                if (cheak == -1) {

                    String[] stringsplit = string.split("@");


                    String string2 = stringsplit[0] + "@" + stringsplit[1];
                    //System.out.println(string2);
                    arrstring[i]=string2;
                }

            }

            if (cheak != -1) {
                if (cheakplus != -1) {

                    string = string.replace(".", "");

                    String[] stringsplit = string.split("@");
                    String tmp = stringsplit[0];
                    stringsplit[0] = tmp.substring(0, tmp.indexOf("+"));
                    String string1 = stringsplit[0] + "@" + stringsplit[1];
                    //System.out.println(string1);
                    arrstring[i]=string1;
                }

            }


            Set<String> set = new HashSet<>(Arrays.asList(arrstring));
            System.out.println(set);

        }


    }


}
