package bg.Lab.BasicSyntaxConditionalStatementsandLoops;

import java.util.Scanner;

public class E08DivisibleBy3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //да започва от 3         и да + през 3 числа
        for (int i = 3; i <= 100 ; i+= 3) {
            System.out.println(i);
        }
    }
}
