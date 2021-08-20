package Methods.Lab;

import java.util.Scanner;

public class E04Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        switch (word) {
            case "add":
                printAdd(firstNumber, secondNumber);
                break;
            case "multiply":
                printMultiply(firstNumber, secondNumber);
                break;
            case "subtract":
                printSubtract(firstNumber, secondNumber);
                break;
            case "divide":
                printDivide(firstNumber, secondNumber);
                break;
        }
    }

    private static void printDivide(int firstNumber, int secondNumber) {
        System.out.println(firstNumber / secondNumber);
    }

    private static void printSubtract(int firstNumber, int secondNumber) {
        System.out.println(firstNumber - secondNumber);
    }

    private static void printMultiply(int firstNumber, int secondNumber) {
        System.out.println(firstNumber * secondNumber);
    }

    private static void printAdd(int firstNumber, int secondNumber) {
        System.out.println(firstNumber + secondNumber);
    }
}
