package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class E01ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double meters = Integer.parseInt(scanner.nextLine());

        double conver = meters / 1000;

        System.out.printf("%.2f", conver);
    }
}
