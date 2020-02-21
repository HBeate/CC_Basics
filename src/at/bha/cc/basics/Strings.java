package at.bha.cc.basics;

import javax.swing.*;

public class Strings {
    public static void main(String[] args) {
        String fruit = "apple";
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
    }
}
