package TextProcessing.MoreExercise;

import java.util.Scanner;

public class E01ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numberOfLines; i++) {
         String currentLine = scanner.nextLine();

         int indexBeforeName = currentLine.indexOf('@');
         int indexAfterName = currentLine.indexOf('|');

         //Here is a name @George| and an age #18*
                       //15      22
         String name = currentLine.substring(indexBeforeName + 1, indexAfterName - indexBeforeName - 1);

         int indexBeforeAge = currentLine.indexOf('#');
         int indexAfterAge = currentLine.indexOf('*');

         String age = currentLine.substring(indexBeforeAge + 1, indexAfterAge - indexBeforeAge - 1);

            System.out.printf( "%s is %s years old.", age);
        }
    }
}
