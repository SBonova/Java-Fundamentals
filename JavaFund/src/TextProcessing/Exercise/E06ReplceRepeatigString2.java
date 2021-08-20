package TextProcessing.Exercise;

import java.util.Scanner;

public class E06ReplceRepeatigString2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();
        StringBuilder builder = new StringBuilder(inputText);

        for (int i = 0; i < inputText.length() - 1; i++) {
            if (inputText.charAt(i) == inputText.charAt(i + 1)){
                builder.deleteCharAt(i + 1);
                i--;
            }
        }
        System.out.println(builder);
    }
}
