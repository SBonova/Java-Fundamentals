package bg.Lab.BasicSyntaxConditionalStatementsandLoops;

import java.util.Scanner;

public class E10MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        //1 ->10
        int multiplier = 1;

        while (multiplier <= 10){
            //Умножаване
            int result = multiplier * number;
            System.out.printf("%d X %d = %d%n", number, multiplier, result);
            multiplier++;
        }

    }
}
