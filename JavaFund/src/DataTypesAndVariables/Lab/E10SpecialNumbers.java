package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class E10SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      int n = Integer.parseInt(scanner.nextLine());

        for (int num = 1; num <= n; num++) {
            int sumOfDigits = 0;
            int digits = num;
            while(digits > 0){
                sumOfDigits += digits % 10;
                digits = digits / 10;
            }
            if (sumOfDigits % 5 == 0 || sumOfDigits % 7 == 0 || sumOfDigits % 11 == 0){
                System.out.printf("%d -> True%n", num);
            }else {
                System.out.printf("%d -> False%n", num);
            }
        }
    }
}
