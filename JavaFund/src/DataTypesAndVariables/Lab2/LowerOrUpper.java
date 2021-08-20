package DataTypesAndVariables.Lab2;

import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      char input = scanner.nextLine().charAt(0);
      //ASC II table

        if (input >96 && input <= 122){
            System.out.println("lower-case");
        }else if (input >64 && input <= 90) {
            System.out.println("upper-case");
        }

    }
}
