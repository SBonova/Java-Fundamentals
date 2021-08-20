package bg.Lab.BasicSyntaxConditionalStatementsandLoops;

import java.util.Locale;
import java.util.Scanner;

public class E07TheatrePromotions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfDay = scanner.nextLine().toLowerCase();
        int age = Integer.parseInt(scanner.nextLine());
        int priceOfTheTicket = 0;

        if (typeOfDay.equals("weekday")) {
            if ((age >= 0 && age <= 18) || (age > 64 && age <= 122)) {
                priceOfTheTicket = 12;
            } else if (age > 18 && age <= 64) {
                priceOfTheTicket = 18;
            }
        } else if (typeOfDay.equals("weekend")) {
            if (age >= 0 && age <= 18 || (age > 64 && age <= 122)) {
                priceOfTheTicket = 15;
            } else if (age > 18 && age <= 64) {
                priceOfTheTicket = 20;
            }
        } else if (typeOfDay.equals("holiday")) {
            if (age >= 0 && age <= 18) {
                priceOfTheTicket = 5;
            } else if (age > 18 && age <= 64) {
                priceOfTheTicket = 12;
            } else if (age > 64 && age <= 122) {
                priceOfTheTicket = 10;
            }
        }

        if (priceOfTheTicket == 0) {
            System.out.println("Error!");
        }else {
            System.out.println(priceOfTheTicket + "$");
        }

    }
}
