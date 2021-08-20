package bg.Lab.BasicSyntaxConditionalStatementsandLoops;

import java.util.Scanner;

public class E11MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        //1 ->10
        int multiplier = Integer.parseInt(scanner.nextLine());

        do {
            //Умножаване
            int result = multiplier * number;
            System.out.printf("%d X %d = %d%n", number, multiplier, result);
            multiplier++;
        } while (multiplier <= 10);

    }
}
