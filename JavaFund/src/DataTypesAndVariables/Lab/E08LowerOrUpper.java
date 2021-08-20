package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class E08LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char first = scanner.next().charAt(0);
       // char second = scanner.next().charAt(0);

        if (first >96 && first <= 122){
            System.out.println("lower-case");
        }else if (first >64 && first <= 90) {
            System.out.println("upper-case");
        }
    }
}
