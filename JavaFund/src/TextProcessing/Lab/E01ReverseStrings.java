package TextProcessing.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class E01ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Use while loop and read strings until you receive "end".
        String words = scanner.nextLine();

        while (!"end".equals(words)){
            //Reverse the string with for loop. Start from the last index and append each symbol to the new string.
            String reversed = "";
            for (int i = words.length() - 1; i >= 0; i--) {
                reversed += words.charAt(i);
            }
            //Print the reversed string in the specified format.
            System.out.printf("%s = %s%n", words, reversed);
            words = scanner.nextLine();
        }
    }
}

