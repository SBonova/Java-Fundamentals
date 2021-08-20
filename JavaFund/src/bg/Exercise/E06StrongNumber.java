package bg.Exercise;

import java.util.Scanner;

public class E06StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //цифра -> факториел -> сумирам
        int number = Integer.parseInt(scanner.nextLine());
        int sumFact = 0;
        int startNumber = number; //началната стойност на числото
        while(number != 0) {
            int lastDigit = number % 10;
            //намираме факториела на цифрата
            int fact = 1;
            for (int n = 1; n <= lastDigit; n++) {
                fact = fact * n;
            }
            //сумираме
            sumFact += fact;
            number = number / 10; // number /= 10
        }

        if(startNumber == sumFact) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
