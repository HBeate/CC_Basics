package at.bha.cc.basics;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BankomatMethoden {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int accountBalance = 0;
        int inputNumber = 0;
        while (inputNumber != 4) {

            System.out.println("Bitte wählen Sie die gewünschte Funktion: ");
            System.out.println("1. Einzahlen");
            System.out.println("2. Abheben");
            System.out.println("3. Kontostand");
            System.out.println("4. Beenden");
            inputNumber = scan.nextInt();
            switch (inputNumber) {
                case 1:
                    accountBalance = getAccountBalanceAfterDeposit(scan, accountBalance);
                    break;
                case 2:
                    accountBalance = getAccountBalanceAfterWithdrawal(scan, accountBalance);
                    break;
                case 3:
                    System.out.println("Ihr Kontostand beträgt: " + accountBalance + " Euro.");
                    break;
                case 4:
                    System.out.println("Transaktion Ende.");
                    break;
                default:
                    System.out.println("Bitte geben Sie eine gültige Auswahl ein.");

            }
        }
    }

    private static int getAccountBalanceAfterWithdrawal(Scanner scan, int accountBalance) {
        System.out.println("Geben Sie den Betrag ein, den Sie abheben möchten.");
        int withdraw = scan.nextInt();
        int overdraft = accountBalance + 150;
        if (withdraw > overdraft) {
            System.out.println("Diese Transaktion ist nicht möglich. Sie überschreiten Ihr Überziehungslimit (150 Euro) um " + (withdraw - overdraft) + " Euro.");
        } else {
            accountBalance = accountBalance - withdraw;
            System.out.println("Sie haben " + withdraw + " Euro abgehoben. Ihr aktueller Kontostand beträgt " + accountBalance + " Euro.");
        }
        return accountBalance;
    }

    private static int getAccountBalanceAfterDeposit(Scanner scan, int accountBalance) {
        System.out.println("Geben Sie den Betrag ein, den Sie einzahlen möchten.");
        int deposit = scan.nextInt();
        System.out.println(deposit);
        accountBalance = accountBalance + deposit;
        System.out.println("Sie haben " + deposit + " Euro einbezahlt. Ihr aktueller Kontostand beträgt " + accountBalance + " Euro.");
        return accountBalance;
    }
}



