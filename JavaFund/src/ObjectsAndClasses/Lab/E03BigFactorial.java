package ObjectsAndClasses.Lab;

import java.math.BigInteger;
import java.util.Scanner;

import static java.lang.String.valueOf;

public class E03BigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int factorial = Integer.parseInt(scanner.nextLine());
        BigInteger bigInteger = new BigInteger("1");
        for (int i = 1; i <= factorial; i++) {
            bigInteger = bigInteger.multiply(BigInteger.valueOf(Integer.parseInt(String.valueOf((i)))));//String.valueOf

        }
        System.out.println(bigInteger);
    }
}
