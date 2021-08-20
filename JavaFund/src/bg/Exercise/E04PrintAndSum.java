package bg.Exercise;

import java.util.Scanner;

public class E04PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //start number
        // end number
        //1. отпечатвам числата в диапазона [старт; енд]
        //2. сумирам -> отпечатвам сумата
        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int number = startNumber; number <= endNumber; number++) {
            System.out.print(number + " ");
            sum += number;

        }
        System.out.println();
        System.out.println("Sum: " + sum) ;
    }
}
