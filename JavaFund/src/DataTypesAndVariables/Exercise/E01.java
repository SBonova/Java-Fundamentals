package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class E01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String outer = "I'm iside the Main()";

        for (int i = 0; i < 10; i++) {
            String inner = "I'm iside the loop";

            System.out.println(inner);
        }

        System.out.println(outer);

    }
}
