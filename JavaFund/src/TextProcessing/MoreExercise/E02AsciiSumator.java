package TextProcessing.MoreExercise;

import java.util.Scanner;

public class E02AsciiSumator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstLine = scanner.nextLine().charAt(0);
        char secondLine = scanner.nextLine().charAt(0);
        String text = scanner.nextLine();

        int startIndex = Math.min(firstLine,secondLine);
        int endIndex = Math.max(firstLine,secondLine);

        int sum = 0;

        for (int i = 0; i < text.length(); i++) {
            int currentChar = text.charAt(i);

            if (currentChar > startIndex && currentChar < endIndex){
               sum += currentChar;
             }
        }
        System.out.println(sum);

    }
}
