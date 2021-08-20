package Methods.Lab;

import java.util.Scanner;

public class E09GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dataType = scanner.nextLine();

        switch (dataType) {
            case "int":
                int firstNum = Integer.parseInt(scanner.nextLine());
                int secondNum = Integer.parseInt(scanner.nextLine());
                int resultNum = getMax(firstNum, secondNum);
                System.out.println(resultNum);
                break;
            case "char":
                char a = scanner.nextLine().charAt(0);
                char b = scanner.nextLine().charAt(0);
                char result = getMax(a, b);
                System.out.println(result);
                break;
            case "string":
                String first = scanner.nextLine();
                String second = scanner.nextLine();
                String resultFrom = getMax(first, second);
                System.out.println(resultFrom);
                break;

        }
    }

    //  1. For this method you need to create three methods with the same name and different signatures.
    //      2. Create a method which will compare integers:
    static int getMax(int firstNum, int secondNUm) {
        if (firstNum > secondNUm) {
            return firstNum;
        }
        return secondNUm;
    }

    //Create a second method with the same name which will compare characters. Follow the logic of the previous method:
    static char getMax(char a, char b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    //Lastly you need to create a method to compare strings. This is a bit different as strings don't allow to be compared with the operators ">" and "<":
    static String getMax(String first, String second) {
        if (first.compareTo(second) >= 0) {
            return first;
        }
        return second;
    }
}
