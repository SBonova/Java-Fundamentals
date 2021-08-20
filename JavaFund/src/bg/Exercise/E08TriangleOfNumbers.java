package bg.Exercise;

import java.util.Scanner;

public class E08TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        for (int row = 1; row <= 6; row++) {
//            //обхождам всички книги от 1 до 4
//            for (int book = 1; book <= 4; book++) {
//
//            }
//        }
        int n = Integer.parseInt(scanner.nextLine());

        for (int row = 1; row <= n; row++) {
            for (int colon = 1; colon <= row; colon++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }

    }
}
