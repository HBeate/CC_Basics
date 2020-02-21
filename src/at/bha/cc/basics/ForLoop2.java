package at.bha.cc.basics;

public class ForLoop2 {
    public static void main(String[] args) {
        int basicNumber = 0;
        //Zähle die geraden Ziffern zwischen 1 und 1000 zusammen - Tip: Starte den Loop bei 2 und erhöhe den Zählindex jeweils um 2.
        for (int i = 2; i <= 1000; i=i+2) {
          //  System.out.println("i:" + i);
            basicNumber = basicNumber + i;

        }
        System.out.println("summe:" + basicNumber);
    }
}
