package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class E12RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sumOfDigits = 0;
        int digits = 0;
        boolean istrueFalse = false;
        for (int num = 1; num <= n; num++) {
            digits = num;
            while (num > 0) {
                sumOfDigits += num % 10;
                num = num / 10;
            }
            boolean trueFalse = (sumOfDigits == 5) || (sumOfDigits == 7) || (sumOfDigits == 11);
            String tF;
            if (trueFalse) {
                tF = "True";
            } else {
                tF = "False";
            }
            System.out.printf("%d -> %s%n", digits,tF);
            sumOfDigits = 0;
            num = digits;
        }
    }
}
