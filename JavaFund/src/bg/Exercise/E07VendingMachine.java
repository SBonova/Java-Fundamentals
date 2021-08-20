package bg.Exercise;

import java.util.Scanner;

public class E07VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalAmountInserted = 0;

        String input = scanner.nextLine();

        while (!input.equals("Start")){

            double insertedCoin = Double.parseDouble(input);
            if (insertedCoin == 0.1 || insertedCoin == 0.2 || insertedCoin == 0.5 || insertedCoin == 1 || insertedCoin == 2){
                totalAmountInserted += insertedCoin;
            }else {
                System.out.printf("Cannot accept %.2f\n",insertedCoin);
            }
            input = scanner.nextLine();
        }

        String product = scanner.nextLine();
        while (!product.equals("End")){

            double price = 0;
            if (product.equals("Nuts") || product.equals("Water") || product.equals("Crisps") || product.equals("Soda") || product.equals("Coke")) {
                if (product.equals("Nuts")) {
                    price = 2;
                } else if (product.equals("Water")) {
                    price = 0.7;
                } else if (product.equals("Crisps")) {
                    price = 1.5;
                } else if (product.equals("Soda")) {
                    price = 0.8;
                } else {
                    price = 1;
                }
                if (totalAmountInserted >= price){
                    System.out.printf("Purchased %s\n",product);
                    totalAmountInserted -= price;
                }else {
                    System.out.println("Sorry, not enough money");
                }
            }else {
                System.out.println("Invalid product");
            }



            product = scanner.nextLine();
        }
        System.out.printf("Change: %.2f",totalAmountInserted);
    }
}
