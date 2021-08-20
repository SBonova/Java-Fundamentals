package Methods.Examse;

import java.util.Scanner;

public class E05AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
         getSum(num1, num2);
        subtract(num1, num2, num3);
    }

    private static int getSum(int num1, int num2) {
        int sum = num1 + num2;

        return sum;
    }

    private static void subtract(int num1, int num2, int num3) {
        int totalSum = getSum(num1, num2) - num3;
        System.out.println(totalSum);
    }
}
