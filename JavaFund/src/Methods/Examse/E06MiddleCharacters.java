package Methods.Examse;

import java.util.Scanner;

public class E06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        printMiddleCharacter(text);

    }

    private static void printMiddleCharacter(String text) {
        // дължината да е нечетна
        if (text.length() % 2 != 0) {
            //елемента на позиция = дължината / 2
            int indexMiddleCharacter = text.length() / 2;
            System.out.println(text.charAt(indexMiddleCharacter));
        } else {//дължината да е четна
            //първи елемент на позиция = дължината / 2 - 1
            //вторият среден елемент позицията = дължината / 2

            int indexFirstMiddleCharacter = text.length() / 2 - 1;
            int indexSecondMiddleCharacter = text.length() / 2;

            System.out.printf("%c%c", text.charAt(indexFirstMiddleCharacter), text.charAt(indexSecondMiddleCharacter));
        }


    }
}
