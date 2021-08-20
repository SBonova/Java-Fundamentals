package DataTypesAndVariables.Lab2;

import java.util.Scanner;

public class PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double britishPound = 1.31;
        double input = Double.parseDouble(scanner.nextLine());

        double convert = input * britishPound;

        System.out.printf("%.3f", convert);

    }
}
