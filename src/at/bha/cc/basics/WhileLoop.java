package at.bha.cc.basics;

import java.util.Random;

//Erstelle ein Programm, das Zufallszahlen zwischen 10 und 30 generiert. Das Programm soll die Zufallszahlen zusammenzählen.
// Sobald die Zahl 15 oder die Zahl 25 kommt, wird das Programm beendet und die Summe der vorherigen Zufallszahlen ausgegeben!
public class WhileLoop {
    public static void main(String[] args) {
        Random random = new Random();
        boolean isFinished = false;
        int sum = 0;

        while (!isFinished) {
            int randomNumber = random.nextInt(20) + 11;
            System.out.println("Zufallszahl: "+randomNumber);
            sum = sum + randomNumber;
            System.out.println("Summe: "+sum);
            if ((randomNumber == 15) || (randomNumber == 25)) {
                isFinished = true;
            }
        }
        System.out.println("Endsumme: "+sum);
    }
}
