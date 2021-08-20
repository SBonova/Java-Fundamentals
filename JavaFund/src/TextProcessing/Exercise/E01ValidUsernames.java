package TextProcessing.Exercise;

import java.util.Scanner;

public class E01ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program that reads user names on a single line (joined by ", ")
        String input = scanner.nextLine();//sh, too_long_username, !lleg@l ch@rs, jeffbutt
        String[] words = input.split(", ");//["sh", "too_long_username", "!lleg@l ch@rs", "jeffbutt"]

        //Обхождаме всяка една дума от масива с foreach цикъл
        for (String word : words) {
            //За всяка една дума трябва да  аправим проверка дали е валидна
            //ако е далидна я печатаме
            if (isValidWord(word)) {
                System.out.println(word);
            }
        }
    }

        private static boolean isValidWord (String word) {
            // Еднаа дума е валидна когато има два параметъра дължината и съдържание
            //Валидна дължина -> от 3 до 16
            //Булева променлива дали дължината е валидна и в началто тя не е валидна
            if (!(word.length() >= 3 && word.length() <= 16)) {
                return false;
            }
            //Проверка дали има валидно съдържание т.е Contains only letters, numbers, hyphens and underscores
            //Обхохдаме всеки един симбол в думата
            for (char symbol : word.toCharArray()) {//за всеки символ от масива със символи
                //Проверка за буква или цифра
                if (!(Character.isLetterOrDigit(symbol) || symbol == '-' || symbol == '_')) {
                    //Валидна
                    return false;
                }
            }
            return true;
        }
}

