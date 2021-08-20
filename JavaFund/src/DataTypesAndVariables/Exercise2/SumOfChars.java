package DataTypesAndVariables.Exercise2;

import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int nTheNumberOfLines = Integer.parseInt(scanner.nextLine());
//        int sum = 0;
//
//        for (int i = 0; i < nTheNumberOfLines; i++) {
//            char letters = scanner.nextLine().charAt(0);
//            sum += letters;
//        }
//        System.out.printf("The sum equals: %d", sum);

        //за всеки симбол -> прочитаме - сумираме
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;// sumata ot ascii codes

        for (int count = 1; count <= n; count++) {
            char symbol = scanner.nextLine().charAt(0);
            //взимаме числата на символите
            sum += (int)symbol;
        }
        System.out.println("The sum equals: " + sum);
    }
}
