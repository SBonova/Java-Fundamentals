package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            int integer = 0;
            double floatingPoint = Double.parseDouble(scanner.nextLine());
            char characters = scanner.nextLine().charAt(0);
            boolean Boolean = scanner.nextBoolean();
            String string = scanner.nextLine();

            if (input.equals("integer")){
                System.out.printf("%s is %d type", integer);
            }


                    input = scanner.nextLine();
        }
    }
}
