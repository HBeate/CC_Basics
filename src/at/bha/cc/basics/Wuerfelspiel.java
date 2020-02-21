package at.bha.cc.basics;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class Wuerfelspiel {

    public static void main(String[] args) {

        //Erstelle ein Würfelspiel! Du spielst gegen den Computer.
        // Wenn das Spiel startet (mit einem kleinen Menü), hat der Spieler 6 Würfe.
        // Er spielt dabei gegen den Computer.
        // Wenn die Augensumme höher ist als jene des Computers hat der Spieler gewonnen, ansonsten der Computer.
        int computer = 0;
        int player = 0;
        String inputKey;
        int actualRoll = 1;
        int maxRolls = 6;
        boolean isFinished = true;
        Random random = new Random();

        Scanner scan = new Scanner(System.in);
        System.out.println("Bei diesem Würfelspiel spielst du gegen den Computer. \nJeder würfelt 6x. \nDrücke eine beliebige Taste, um zu würfeln. ");

        while (actualRoll <= maxRolls) {

            inputKey = scan.nextLine();
            int randomNumberComputer = random.nextInt(6) + 1;
            int randomNumberPlayer = random.nextInt(6) + 1;

            computer = computer + randomNumberComputer;
            player = player + randomNumberPlayer;

            System.out.println("Durchgang: " + actualRoll);
            System.out.println("Computer Würfel: " + randomNumberComputer + " -  Augenzahl gesamt: "+ computer);
            System.out.println("Player Würfel: " + randomNumberPlayer + " -  Augenzahl gesamt: "+ player);


            actualRoll++;
            //  Scanner scan = new Scanner(System.in);
        }
        System.out.println();
        System.out.println("Player Augenzahl Summe: " + player);
        System.out.println("Computer Augenzahl Summe: " + computer);


        if (computer > player) {
            System.out.println("Der Computer hat gewonnen!");
        } else if (computer == player) {
            System.out.println("Unentschieden");
        } else {
            System.out.println("Du hast gewonnen!");
        }
    }
}



