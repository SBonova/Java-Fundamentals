package Methods.Lab;

import java.util.Scanner;

public class readNumbersFromMasive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArray = readArray();

        for (int i : firstArray) {
            int number = 0;
            System.out.print(number + " ");
        }

    }

    private static int[] readArray() {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        //String line = "42 13 69 54 102 153";
        String[] numberAsStrings = line.split(" ");

        int[] array = new int[numberAsStrings.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(numberAsStrings[i]);

        }

        return  new int[0];
    }
}
