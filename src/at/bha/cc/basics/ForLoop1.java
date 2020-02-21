package at.bha.cc.basics;

public class ForLoop1 {
    public static void main(String[] args) {
        int basicNumber = 0;
        //Zähle in einem For-Loop die Zahlen von 1 bis 100 (inklusive) zusammen
        for (int i = 0; i<=100; i++){
            basicNumber +=i;
            System.out.println(i);
            System.out.println(basicNumber);
        }
    }
}
