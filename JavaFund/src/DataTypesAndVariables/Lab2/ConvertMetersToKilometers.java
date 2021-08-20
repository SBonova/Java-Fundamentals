package DataTypesAndVariables.Lab2;

import java.util.Scanner;

public class ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int meters = Integer.parseInt(scanner.nextLine());
        double kilometers = 1.0 * meters / 1000;

        System.out.printf("%.2f", kilometers);

    }
}
