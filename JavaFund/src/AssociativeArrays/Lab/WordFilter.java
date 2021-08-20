package AssociativeArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.Da prochetem red
        //2. Split na masiv
        //3.cikal -> print samo dumite s cheten broi bukvi

        String[] input = scanner.nextLine().split(" ");
        Arrays.stream(input).
                filter(word -> word.length() % 2 == 0)
                .forEach(System.out::println);
    }
}
