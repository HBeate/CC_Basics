package at.bha.cc.basics;

public class FirstLetter {
    public static void main(String[] args) {
        System.out.println();
        for (int i = 0; i <= 6; i++) {
            for (int j = 0; j <= 50; j++) {
                if (i == 0) {                        // wenn wir in Reihe 1 sind
                    if (j <= 4 || j>9 && j<16 || j>20 && j<25 ||j>28 &&j<36 || j>=40 && j <=45) {
                        System.out.print("X");
                    } else {
                        System.out.print(" ");
                    }
                } else if (i == 1) {
                    if (j == 0 || j == 5 || j == 10|| j ==20 || j ==25 || j==32|| j == 40) {
                        System.out.print("X");
                    } else {
                        System.out.print(" ");
                    }
                } else if (i == 2) {
                    if (j == 0 || j == 5|| j == 10|| j ==20 || j ==25|| j==32|| j == 40) {
                        System.out.print("X");
                    } else {
                        System.out.print(" ");
                    }
                    } else if (i == 3 ) {
                        if (j <= 3|| j>9 && j<15|| j>19 && j<26|| j ==20 || j ==25|| j==32|| j>=40 && j <=44) {
                            System.out.print("X");
                        } else {
                            System.out.print(" ");
                        }
                } else if (i == 4) {
                    if (j == 0 || j == 5|| j == 10|| j ==20 || j ==25|| j==32|| j == 40) {
                        System.out.print("X");
                    } else {
                        System.out.print(" ");
                    }
                } else if (i == 5) {
                    if (j == 0 || j == 5|| j == 10|| j ==20 || j ==25|| j==32|| j == 40) {
                        System.out.print("X");
                    } else {
                        System.out.print(" ");
                    }
                } else if (i == 6) {
                    if (j <= 4|| j>9 && j<16|| j ==20 || j ==25|| j==32|| j>=40 && j <=45) {
                        System.out.print("X");
                    } else {
                        System.out.print(" ");
                    }
                    }
                }
            System.out.println();
            }
        }
    }

