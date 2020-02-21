package at.bha.cc.basics;

import javax.swing.*;

public class Strings {
    public static void main(String[] args) {
   /*     String fruit = "apple";                             //Aufgabe 1
        String beverage = "cider";
        String beverageFlavour = fruit + beverage;
        System.out.println(beverageFlavour);

        char[] c ={'b', 'e', 'a', 't', 'e'};
        String s = String.valueOf(c);
        System.out.println(s);


       String name = "Beate Hauser";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        String name1 ="Beate Hauser";
        String name2 ="Beate HAUSER";
        if (name1.equalsIgnoreCase(name2)){
            System.out.println("Sind gleich");
        }
        else{
            System.out.println("Sind unterschiedlich");
        }
        if (name1.equals(name2)){
            System.out.println("Sind gleich");
        }
        else{
            System.out.println("Sind unterschiedlich");
        }
        System.out.println(name1.charAt(0));
        System.out.println(name1.charAt(6));

        System.out.println(name1.substring(6));
        System.out.println(name.substring(0,5));
        System.out.println(name.substring(0,5)+ name.substring(1));*/

        String meinSubstring = "Ich heisse Beate";                //Aufgabe 2
        System.out.println(meinSubstring.substring(5, 7));

        System.out.println(meinSubstring(meinSubstring,5,7));
    }

    private static String meinSubstring(String meinSubstring,int startIndex, int endIndex) {
        String meinNewSubstring = "";
        for (int i = 0; i < meinSubstring.length(); i++) {
            if (i >= startIndex && i < endIndex) {
             //   System.out.println(meinSubstring.charAt(i));
                meinNewSubstring=meinNewSubstring + meinSubstring.charAt(i);
            }
        }return meinNewSubstring;
    }
}
