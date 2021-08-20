package DataTypesAndVariables.Lab2;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int num = 1; num <= n; num++) {
            int digits = num;
            int sum = 0;
            while (digits > 0){
                int currentDigit = digits % 10;
                sum = sum + currentDigit;
                digits = digits / 10;
            }
            if (sum == 5 || sum == 7 || sum == 11){
                System.out.println(num + " -> True");
            }else {
                System.out.println(num + " -> False");
            }
        }
    }
}
