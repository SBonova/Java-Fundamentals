package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class E02SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String n = scanner.nextLine();
        int sum = 0;

        for (int i = 0; i < n.length(); i++) {
            int currentNum = (int)n.charAt(i) - 48;
            sum += currentNum;
        }
        System.out.println(sum);
    }
}
