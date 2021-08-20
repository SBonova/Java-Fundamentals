package bg.Exercise;

import java.util.Scanner;

public class E03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantity = Integer.parseInt(scanner.nextLine());
        String group = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0;

        if (group.equals("Students")) {
            if ("Friday".equals(day)) {
                price = quantity * 8.45;
            } else if ("Saturday".equals(day)) {
                price = quantity * 9.80;
            } else if ("Sunday".equals(day)) {
                price = quantity * 10.46;
            }
            if (quantity >=30){
                price = price * 0.85;

            }
        } else if (group.equals("Business")) {
            if (quantity >=100) {
                quantity -= 10;
            }
            if ("Friday".equals(day)) {
                price = quantity * 10.90;
            } else if ("Saturday".equals(day)) {
                price = quantity * 15.60;
            } else if ("Sunday".equals(day)) {
                price = quantity * 16.00;
            }
        } else if (group.equals("Regular")){
            if ("Friday".equals(day)) {
                price = quantity * 15.00;
            } else if ("Saturday".equals(day)) {
                price = quantity * 20.00;
            } else if ("Sunday".equals(day)) {
                price = quantity * 22.50;
            }
            if (quantity >=10 && quantity<=20){
                price = price * 0.95;
            }
        }
        System.out.printf("Total price: %.2f",price);


    }
}
