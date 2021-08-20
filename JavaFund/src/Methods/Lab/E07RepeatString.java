package Methods.Lab;

import java.util.Scanner;

public class E07RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       String input = scanner.nextLine();
       int count = Integer.parseInt(scanner.nextLine());
      String repeatedString = repeatString(input, count);
        System.out.println(repeatedString);
    }

    //Write a method that receives a string and a repeat count n (integer).
    private static String repeatString(String input, int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result = result + input;
        }
        //The method should return a new string (the old one repeated n times).
        return result;
    }
}
