package Methods.Examse;

import java.util.Scanner;

public class E09PalendromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine(); //число или "END"

        while(!command.equals("END")) {
            //число под формата на текст -> "234"
            System.out.println(isPalindrome(command));

            command = scanner.nextLine();
        }

    }

    //метод, който проверява дали числото ми е палиндром
    //true -> ако е палиндром
    //false -> ако не е палиндром
    private static boolean isPalindrome(String number) {
        //проверка дали числото е същото като числото записано на обратно ->
        String reversedNumber = getReversedNumber(number);
        return number.equals(reversedNumber);
    }

    private static String getReversedNumber(String number) {
        //"234" -> "432"
        //обхождаме числото от последния към първия елемент
        String reversed = "";
        for (int index = number.length() - 1; index >= 0 ; index--) {
            char currentElement = number.charAt(index);
            reversed += currentElement;
        }

        //обходила всички елементи
        return reversed;
    }
}
