package Methods.Lab;

import java.util.Scanner;

public class E05Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        calculates(product, quantity);
    }

    private static void calculates(String product, double quantity) {
        double totalPrice = 0;
        double price = 0;
        if (product.equals("coffee")) {
            price = 1.50;
            totalPrice = price * quantity;
        } else if (product.equals("water")) {
            price = 1.00;
            totalPrice = price * quantity;
        } else if (product.equals("coke")) {
            price = 1.40;
            totalPrice = price * quantity;
        } else if (product.equals("snacks")) {
            price = 2.00;
            totalPrice = price * quantity;
        }
        System.out.printf("%.2f", totalPrice);
    }
}
