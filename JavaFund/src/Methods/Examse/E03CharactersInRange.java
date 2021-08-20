package Methods.Examse;

import java.util.Scanner;

public class E03CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char symbol1 = scanner.nextLine().charAt(0);
        char symbol2 = scanner.nextLine().charAt(0);

        printSequenceBetweenSymbols(symbol1, symbol2);
    }

    private static void printSequenceBetweenSymbols(char symbol1, char symbol2) {
        //проверка и да започваме от символите с по-малък АСКИ код
        if (symbol1 < symbol2) {
            //започвам принтиране от символ1
            for (char symbol = (char)(symbol1 + 1); symbol < symbol2; symbol++) {
                System.out.print(symbol + " ");
            }
        } else //започвам принтиране от символ1
            for (char symbol = (char)(symbol2 + 1) ; symbol < symbol1; symbol++) {
                System.out.print(symbol + " ");
            }
    }
}
