package DataTypesAndVariables.Lab2;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n = Double.parseDouble(scanner.nextLine());
        BigDecimal sum = new BigDecimal(0);

        for (int i = 0; i < n; i++) {
            BigDecimal currNum = new BigDecimal(scanner.nextLine());
            sum = sum.add(currNum);
        }

        System.out.println(sum);
    }
}
