package Methods.Lab;

import java.util.Scanner;

public class retangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        int repetitionsCount = Integer.parseInt(scanner.nextLine());

        String repeated = repeat(s, repetitionsCount);

        System.out.println(repeated);
    }

    static String repeat(String s, int count) {
        String[] repetitions = new String[count];

        for (int i = 0; i < count; i++) {
            repetitions[i] = s;
        }

        String repeated = String.join("", repetitions);
        return repeated;
    }
}
