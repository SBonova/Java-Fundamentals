package MidExam.E01ProgrammingFundamentalsMidExamRetake;

import java.util.Scanner;

public class E01ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.nextLine();
        double totalWithoutTaxes = 0;

        //докато клиента не е регула и не е спешал
        //логическо и -&&
        //логическо или - ||
        while (!userInput.equals("regular") && !userInput.equals("special")) {
            double currentPrice = Double.parseDouble(userInput);
            //If a given price is not positive number
            if (currentPrice < 0) {
                System.out.println("Invalid price!");
            } else {
                //Price without taxes
                totalWithoutTaxes += currentPrice;
            }

            userInput = scanner.nextLine();
        }
        //If total price is equal to zero
        if (totalWithoutTaxes == 0) {
            System.out.println("Invalid order!");
            return;
        }
        //The taxes are 20% of each part's price you receive.
        double taxes = totalWithoutTaxes * 0.2;
        double finalPrice = totalWithoutTaxes + taxes;

        if (userInput.equals("special")) {
            //If the customer is special, then he has a 10% discount of the price of the total price with taxes.
            finalPrice = finalPrice * 0.90;
        }

        printRecipt(taxes, finalPrice, totalWithoutTaxes);
    }

    private static void printRecipt(double taxes, double finalPrice, double totalWithoutTaxes) {
        System.out.println("Congratulations you've just bought a new computer!");
        System.out.printf("Price without taxes: %.2f$%n", totalWithoutTaxes);
        System.out.printf("Taxes: %.2f$%n", taxes);
        System.out.println("-----------");
        System.out.printf("Total price: %.2f$", finalPrice);
    }
}

