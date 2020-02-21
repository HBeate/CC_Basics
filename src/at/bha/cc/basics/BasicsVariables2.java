package at.bha.cc.basics;

import java.util.Scanner;
import java.util.concurrent.Callable;
import java.text.DecimalFormat;

public class BasicsVariables2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat twoPlaces = new DecimalFormat("0.00");

        // Erstelle eine Variable banana mit dem Wert "Banane"
        String banana = "Banane";
        // Erstelle eine Variable apple mit dem Wert "Apple"
        String apple = "Apple";
        // Erstelle eine Variable bananaPricePerKilo mit dem Wert 2.14
        double bananaPricePerKilo = 2.14;
        // Erstelle eine Variable applePricePerKilo mit dem Wert 3.43
        double applePricePerKilo = 3.43;
        // Ein Apfel hat durchschnittlich ein Gewicht von 0.34 Kilo
        double weightApple = 0.34;
        double amountApplePricePerPiece = applePricePerKilo * weightApple;
        double eightApplesPrice = amountApplePricePerPiece * 8;

        // Eine Banane hat durchschnittlich ein Gewicht von 0.22 Kilo
        double weightBanana = 0.22;
        double amountBananaPricePerPiece = bananaPricePerKilo * weightBanana;
        double seventeenBananasPrice = amountBananaPricePerPiece * 17;


        // Gib folgendes aus: Anzahl Bananen/Äpfel pro Kilo, Preis pro Banane/Apfel
        // Preis von 8 Äpfeln
        System.out.println("8 Äpfel kosten " + (twoPlaces.format(eightApplesPrice)) + " Euro.");

        // Preis von 17 Bananen
        System.out.println("17 Bananen kosten " + (twoPlaces.format(seventeenBananasPrice)) + " Euro.");

        // Preis von 1 Tonne Äpfel
        System.out.println("Eine Tonne Äpfel kostet " + (twoPlaces.format(applePricePerKilo * 1000)) + " Euro.");

        // Preis von 1 Tonne Bananen
        System.out.println("Eine Tonne Bananen kostet " + (twoPlaces.format(bananaPricePerKilo * 1000)) + " Euro.");
        System.out.println("Wieviele Äpfel willst du kaufen?");

        int inputNumberÄpfel = scan.nextInt();
        System.out.println(inputNumberÄpfel + " Äpfel kosten " + (twoPlaces.format(amountApplePricePerPiece * inputNumberÄpfel)));
        System.out.println("Wieviele Bananen willst du kaufen?");

        int inputNumberBananen = scan.nextInt();
        System.out.println(inputNumberBananen + " Bananen kosten " + (twoPlaces.format(amountBananaPricePerPiece * inputNumberBananen)));

    }
}
