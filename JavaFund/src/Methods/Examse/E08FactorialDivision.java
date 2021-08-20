package Methods.Examse;

import java.util.Scanner;

public class E08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        factorial(num1, num2);
    }

    private static void factorial(int num1, int num2) {
        double fact = 1;
        for (int n = 1; n <= num1; n++) {
            fact = fact * n;
        }


        double fact2 = 1;
        for (int i = 1; i <= num2; i++) {
            fact2 = fact2 * i;
        }
      //  System.out.println(fact2);
        System.out.printf("%.2f", fact / fact2);
    }
}
