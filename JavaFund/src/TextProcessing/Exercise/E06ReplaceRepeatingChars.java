package TextProcessing.Exercise;

import java.util.Scanner;

public class E06ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //текста който ми се въвежда
        String inputText = scanner.nextLine();
        //конструира новият текст
        StringBuilder newText = new StringBuilder();

        //1.добавям първата буква към новия текст
        char firstLetter = inputText.charAt(0);
        newText.append(firstLetter);
        //2. взимам всички други букви до края

        for (int i = 1; i < inputText.length(); i++) {
            char currSymbol = inputText.charAt(i);
            //-> проверявам дали текущата буква я различна от последната добавена в новия текст
            // ако е различна ->  добавям я в новия текст
            if (currSymbol != newText.charAt(newText.length() - 1)){
                newText.append(currSymbol);
            }
        }
        System.out.println(newText);
    }
}
