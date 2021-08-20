package DataTypesAndVariables.MoreExercise;

import java.util.Scanner;

public class DecryptingMessages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte key = Byte.parseByte(scanner.nextLine());
        byte n = Byte.parseByte(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
           char input = scanner.nextLine().charAt(0);
           int value = input + key;

           char message = (char)value;

            System.out.print(message);
        }

    }
}
