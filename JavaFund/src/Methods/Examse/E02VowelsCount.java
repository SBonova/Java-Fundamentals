package Methods.Examse;

import java.util.Locale;
import java.util.Scanner;

public class E02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().toLowerCase();
        printCountVowels(text);
    }

    //prints the count of the vowels
    private static void printCountVowels(String text) {
        //1.трябва да охожда текста т.е да взима всички символи
        //2. проверка дали символи е гласна буква - a, e i, o, u
        //3. print
        int countVowels = 0;

        for (int index = 0; index <= text.length() - 1; index++) {
            char currentSymbol = text.charAt(index);
            switch (currentSymbol){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    countVowels++;
                    break;
            }
        }
        System.out.println(countVowels);
    }


}
