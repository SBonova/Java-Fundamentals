package TextProcessing.Lab;

import java.util.Scanner;

public class E05DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Прочитаме входа
        String input = scanner.nextLine();

        //тук държим числата, буквите и симболите
        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder symbols = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);
            if (Character.isDigit(currentSymbol)){
                digits.append(currentSymbol);
            }else if (Character.isAlphabetic(currentSymbol)){
                letters.append(currentSymbol);
            }else {
                symbols.append(currentSymbol);
            }
        }

        System.out.println(digits);
        System.out.println(letters);
        System.out.println(symbols);

    }
}
