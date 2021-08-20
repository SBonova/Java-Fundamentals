package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class Е02PoundsТoDollars {
    public static void main(String[] args) {
       // double pounds = new Scanner(System.in).nextDouble();
       // System.out.printf("%.3f",pounds * 1.31);
        int cents = new Scanner(System.in).nextInt();
        double convertedCents = cents * 1.31;
        int wholeDollars = (int)convertedCents / 100;
        int wholeCents = (int)convertedCents % 100;

        System.out.printf("%02d.%02d", wholeDollars, wholeCents );


    }
}
