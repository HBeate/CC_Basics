package at.bha.cc.basics;

import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int scanMonth = 0;
        int scanDay = 0;
        int month = 0;
        System.out.println("Please enter the number of the month.");
        scanMonth = scan.nextInt();
        System.out.println("On which day does the month begin? Enter the number (Mon=1, Tue=2, Wed=3, Thur=4, Fri=5, Sat=6, Sun=7)");
        scanDay = scan.nextInt();

        if (scanMonth == 4 || scanMonth == 6 || scanMonth == 9 || scanMonth == 11) {
            month = 30;
        } else if (scanMonth == 2) {
            month = 28;
        } else if (scanMonth == 1 || scanMonth == 3 || scanMonth == 5 || scanMonth == 7 || scanMonth == 8 || scanMonth == 10 || scanMonth == 12) {
            month = 31;
        } else
            System.out.println("Please check your input.");
        System.out.println();

        System.out.println("|\tMO\t|\tDI\t|\tMI\t|\tDO\t|\tFR\t|\tSA\t|\tSO\t|");
        switch (scanDay) {
            case 1:
                for (int i = 0; i < 5; i++) {
                    for (int j = 1; j <= month; j++) {
                        if (scanDay == 1 && i == 0) {  // Monday
                            if (j < 10) {
                                System.out.print("|\t" + j + "\t");
                            } else if (j >= 10) {
                                System.out.print("|\t" + j + "\t");
                            }
                            if (j == 7 || j == 14 || j == 21 || j == 28) {
                                System.out.println("|");
                            }
                        }
                    }
                }
                System.out.print("|");
                break;
            case 2:
                System.out.print("|        ");
                for (int i = 0; i < 5; i++) {
                    for (int j = 1; j <= month; j++) {
                        if (scanDay == 2 && i == 0) {  // Monday
                            if (j < 10) {
                                System.out.print("|    " + j + "   ");
                            } else if (j >= 10) {
                                System.out.print("|   " + j + "   ");
                            }
                            if (j == 6 || j == 13 || j == 20 || j == 27) {
                                System.out.println("|");
                            }
                        }
                    }
                }
                System.out.print("|");
                break;
            case 3:
                System.out.print("|        |        ");
                for (int i = 0; i < 5; i++) {
                    for (int j = 1; j <= month; j++) {
                        if (scanDay == 3 && i == 0) {  // Monday
                            if (j < 10) {
                                System.out.print("|    " + j + "   ");
                            } else if (j >= 10) {
                                System.out.print("|   " + j + "   ");
                            }
                            if (j == 5 || j == 12 || j == 19 || j == 26) {
                                System.out.println("|");
                            }
                        }
                    }
                }
                System.out.print("|");
                break;
            case 4:
                System.out.print("|        |        |        ");
                for (int i = 0; i < 5; i++) {
                    for (int j = 1; j <= month; j++) {
                        if (scanDay == 4 && i == 0) {  // Monday
                            if (j < 10) {
                                System.out.print("|    " + j + "   ");
                            } else if (j >= 10) {
                                System.out.print("|   " + j + "   ");
                            }
                            if (j == 4 || j == 11 || j == 18 || j == 25) {
                                System.out.println("|");
                            }
                        }
                    }
                }
                System.out.print("|");
                break;
            case 5:
                System.out.print("|        |        |        |        ");
                for (int i = 0; i < 5; i++) {
                    for (int j = 1; j <= month; j++) {
                        if (scanDay == 5 && i == 0) {  // Monday
                            if (j < 10) {
                                System.out.print("|    " + j + "   ");
                            } else if (j >= 10) {
                                System.out.print("|   " + j + "   ");
                            }
                            if (j == 3 || j == 10 || j == 17 || j == 24) {
                                System.out.println("|");
                            }
                        }
                    }
                }
                System.out.print("|");
                break;
            case 6:
                System.out.print("|\t\t|\t\t|\t\t|\t\t|\t\t");
                for (int i = 0; i < 5; i++) {
                    for (int j = 1; j <= month; j++) {
                        if (scanDay == 6 && i == 0) {  // Monday
                            if (j < 10) {
                                System.out.print("|\t" + j + "\t");
                            } else if (j >= 10) {
                                System.out.print("|\t" + j + "\t");
                            }
                            if (j == 2 || j == 9 || j == 16 || j == 23 || j == 30) {
                                System.out.println("|");
                            }
                        }
                    }
                }
 //               System.out.print("|");
                break;
            case 7:
                System.out.print("|        |        |        |        |        |        ");
                for (int i = 0; i < 5; i++) {
                    for (int j = 1; j <= month; j++) {
                        if (scanDay == 7 && i == 0) {  // Monday
                            if (j < 10) {
                                System.out.print("|    " + j + "   ");
                            } else if (j >= 10) {
                                System.out.print("|   " + j + "   ");
                            }
                            if (j == 1 || j == 8 || j == 15 || j == 22 || j == 29) {
                                System.out.println("|");
                            }
                        }
                    }
                }
                System.out.print("|");
                break;
            default :
                System.out.println("E" +
                        "Please enter a number from 1 to 7 for the day.");
        }
    }

}








