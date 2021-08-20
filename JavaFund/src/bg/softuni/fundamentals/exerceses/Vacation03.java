package bg.softuni.fundamentals.exerceses;

import java.util.Scanner;

public class Vacation03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peaopleCount = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String day = scanner.nextLine();
        double totalPrice = 0;

        switch (typeOfGroup) {
            case "Students":
                switch (day) {
                    case "Friday":
                        totalPrice = peaopleCount * 8.45;
                        break;
                    case "Saturday":
                        totalPrice = peaopleCount * 9.80;
                        break;
                    case "Sunday":
                        totalPrice = peaopleCount * 10.46;
                        break;
                }
                if (peaopleCount >= 30) {
                    totalPrice *= 0.85;
                }
                break;
            case "Business":
                double currentPrice = 10.90;
                switch (day) {
                    case "Friday":
                        totalPrice = peaopleCount * 10.90;
                        break;
                    case "Saturday":
                         currentPrice = 15.60;
                        totalPrice = peaopleCount * 15.60;
                        break;
                    case "Sunday":
                        currentPrice = 16;
                        totalPrice = peaopleCount * 16;
                        break;

                }
                if (peaopleCount >= 100) {
                    totalPrice -= currentPrice * 10;
                }
                break;
            case "Regular":
                switch (day) {
                    case "Friday":
                        totalPrice = peaopleCount * 15;
                        break;
                    case "Saturday":
                        totalPrice = peaopleCount * 20;
                        break;
                    case "Sunday":
                        totalPrice = peaopleCount * 22.50;
                        break;
                }
                if (peaopleCount >= 10 && peaopleCount <= 20) {
                    totalPrice *= 95;
                }
                break;
        }
        System.out.printf("Total price: %.2f", totalPrice);

    }
}
