package TextProcessing.Exercise;

import java.util.Scanner;

public class Е05MultiplyBigNumber2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        if (number == 0) {
            System.out.println(0);
            return;
        }
        String bigNumber = "";
        while (bigNumber.charAt(0) == '0') {
            bigNumber = bigNumber.substring(1);
        }
        StringBuilder builder = new StringBuilder();
        int result = 0;
        int reminder = 0;
        for (int i = bigNumber.length() - 1; i >= 0; i--) {
            int currentDigit = Integer.parseInt(String.valueOf(bigNumber.charAt(i)));
            result = currentDigit * number + reminder;
            reminder = 0;
            if (result > 9) {
                reminder = result / 10;
                result = result % 10;
            }
            builder.append(result);
        }
        if (reminder != 0) {
            builder.append(reminder);
        }
        System.out.println(builder.reverse());
    }
}
