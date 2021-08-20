package bg.Exercise;

import java.util.Scanner;

public class E02Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // търсим най-големият делител между 2,3,6,7,10

        int number = Integer.parseInt(scanner.nextLine());

        int divider = 0;

        if (number % 10 == 0) {
            divider = 10;
        }else if (number % 7 == 0) {
            divider = 7;
        }else if (number % 6 == 0) {
            divider = 6;
        }else if (number % 3 == 0) {
            divider = 3;
        }else if (number % 2 == 0) {
            divider = 2;
        }

        //ако нямаме делител
        if (divider == 0){
            System.out.println( "Not divisible");
        }else {// divider != 0
            System.out.println("The number is divisible by " + divider);
        }


    }
}
