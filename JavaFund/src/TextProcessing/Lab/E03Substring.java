package TextProcessing.Lab;

import java.util.Scanner;

public class E03Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String wordToRemove = scanner.nextLine();
        String input = scanner.nextLine();

        while (input.contains(wordToRemove)){
            input = removeOccurrence(input,wordToRemove);
        }
        System.out.println(input);
    }

    private static String removeOccurrence(String text, String wordToRemove) {
        int beginIndex = text.indexOf(wordToRemove);
        int endIndex = wordToRemove.length() + beginIndex;

        String firstPart = text.substring(0, beginIndex);
        String secondPart = text.substring(endIndex);



        return firstPart + secondPart;
    }
}
