package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class E06TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n =Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            char first =(char)(i + 97);
            for (int j = 0; j < n; j++) {
                char second =(char)(j + 97);
                for (int k = 0; k < n; k++) {
                    char third =(char)(k + 97);

                    System.out.printf("%c%c%c%n", first, second, third);
                }

            }
            
        }
    }
}
