package Methods.Lab;

import java.util.Scanner;

public class E03PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        printTopLine(input);
        printButtonLine(input);
    }

    private static void printTopLine(int input) {
        for (int i = 1; i < input; i++) {
            printSingleLine(i);
        }
    }

    private static void printSingleLine(int length) {
        for (int i = 1; i <= length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void printButtonLine(int input) {
        for (int i = input; i >= 1 ; i--) {
            printSingleLine(i);
        }
    }
}
