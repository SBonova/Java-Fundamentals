package bg.Lab.BasicSyntaxConditionalStatementsandLoops;

import java.util.Scanner;

public class E09SumОfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

       // Write a program that prints the next n odd numbers (starting from 1)
        for (int i = 1; i <= n; i++) {
            int oddNumber = 2 * i - 1;
            System.out.println(oddNumber);
            sum += oddNumber;
        }
        //n = 3 sa wrytkite= подаваме ги на конзолата
        //2 * 1 - 1 = 1
        //2 * 2 - 1 = 3
        //2 * 3 - 1 = 5
        //сумата = 5 + 3 + 1 = 9 on the last row prints the sum of them.
        System.out.printf("Sum: %d", sum);
    }
}
