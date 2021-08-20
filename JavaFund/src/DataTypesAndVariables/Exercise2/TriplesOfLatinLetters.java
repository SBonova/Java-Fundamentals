package DataTypesAndVariables.Exercise2;

import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
//
//        for (int i = 0; i < n; i++) {
//            char first = (char)(i + 97);
//            for (int j = 0; j < n; j++) {
//                char second = (char)(j + 97);
//                for (int k = 0; k < n; k++) {
//                    char third = (char)(k + 97);
//
//                    System.out.printf("%c%c%c%n", first, second, third);
//                }
//            }
//        }

        for (char i = 'a'; i < 'a' + n; i++) {
            for (char j = 'a'; j < 'a' + n; j++) {
                for (char k = 'a'; k < 'a' + n; k++) {
                    System.out.printf("%c%c%c%n", i, j, k);
                }
            }

        }

    }
}
