package DataTypesAndVariables.MoreExercise;

import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte n = Byte.parseByte(scanner.nextLine());
        byte openBrackets = 0;
        byte closeBrackets = 0;
        boolean isBalanced = true;

        for (char i = 1; i <= n; i++) {
            String length = scanner.nextLine();

            if (length.equals("(")){
                openBrackets++;
                if (openBrackets - closeBrackets >= 2){
                    isBalanced = false;
                    break;
                }
            }else if (length.equals(")")){
                closeBrackets++;
                if (closeBrackets > openBrackets){
                    isBalanced = false;
                    break;
                }
            }
        }

        if (openBrackets != closeBrackets){
            System.out.println("UNBALANCED");
        }else {
           System.out.println("BALANCED");
        }
    }
}
