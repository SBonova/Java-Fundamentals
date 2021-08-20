package bg.MoreExercise;

import java.util.Scanner;

public class E05Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());

        int currentNumber = 0;
        int mainDigit = 0;
        int digitalLength = 0;
        int offset = 0;
        int letterIndex = 0;


        for (int i = 0; i < length; i++) {
            currentNumber = Integer.parseInt(scanner.nextLine());
            while (currentNumber != 0) {
                digitalLength++;
                mainDigit = currentNumber % 10;
                currentNumber /= 10;
            }
            offset = (mainDigit - 2) * 3;
            if (mainDigit == 8 || mainDigit == 9) {
                offset += 1;
            }
            letterIndex = (offset + digitalLength - 1);
            char symbol = (char) (letterIndex + 97);
            if (digitalLength == 0) {
                System.out.print(" ");
            } else {
                System.out.print(symbol);
            }
            digitalLength = 0;
        }

    }
}
