package TextProcessing.Lab;
import java.util.Arrays;
import java.util.Scanner;

public class E02RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        Arrays.stream(words)
                .map(word -> repeatWord(word, word.length()))
                .forEach(repeatedWord -> System.out.print(repeatedWord));

    }

    private static String repeatWord(String word, int numberOfRepetitions) {
        String result = "";
        for (int i = 0; i < numberOfRepetitions; i++) {
            result += word;
        }
        return result;
    }
}
