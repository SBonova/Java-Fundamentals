package Methods.Lab;

import java.util.Scanner;

public class zad {
    public static void main(String[] args) {
        int maxLineLength =  new Scanner(System.in).nextInt();

        for (int i = 1; i <= maxLineLength; i++) {
            printLineOfNumbersIncreasing(i);
        }

        for (int i = maxLineLength - 1; i >= 1; i--) {
            printLineOfNumbersIncreasing(i);
        }


    }

    private static void printLineOfNumbersIncreasing(int maxNumber) {
         for (int i = 1; i <= maxNumber; i++) {
            System.out.print(i);
            if (i < maxNumber) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

}
