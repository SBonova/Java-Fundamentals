package DataTypesAndVariables.Lab;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Scanner;

public class E01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1 Jan 1970 00:00:00.000
        //   Date date = new Date();
        //teku6tata data
        // System.out.println(date);
        //mili sekundi
        //   System.out.println(date.getTime());

        //прочитане на година от конзолата
        //int year = new Scanner(System.in).nextInt();
        //kolko unixepoch vreme e minalo
        //final-означава, че тази променлива не може да бъде пронменяна понататък в кода
        // final int unixEpochTimeStartYear = 1970;

        //  int yearsPassed = year - unixEpochTimeStartYear;

        //   System.out.println(yearsPassed);

        // final int secondsInAYear = 365 * 24 * 60 * 60;
        // System.out.println(yearsPassed * secondsInAYear);

        //  long epochTime = yearsPassed * secondsInAYear;
        //   System.out.println(epochTime);

        //    double pounds = new Scanner(System.in).nextDouble();
        //    System.out.printf("%.3f",pounds * 1.31);


        // прочитане на две числа от конзолата
//        int n = Integer.parseInt(scanner.nextLine());
//        BigDecimal sum = new BigDecimal(0);
//
//        for (int i = 0; i < n; i++) {
//            String numberAsString = scanner.nextLine();
//            BigDecimal number = new BigDecimal(numberAsString);
//            sum = sum.add(number);
//        }
//        System.out.println(sum);

        // long biggerNumber = 42;
        //int number = (int)biggerNumber;//=>конвертиране-kastwane/експлицитно или инплицитно
        //  double kgNeeded = 30.3;
        //   int number = (int) Math.ceil(kgNeeded);
        //   System.out.println(number);

        //има ли въведени отрицателни цисла
//        int n = scanner.nextInt();
//        boolean foundNegetive = false;
//        int sum = 0;
//
//        for (int i = 0; i < n; i++) {
//            int number = scanner.nextInt();
//            sum += number;
//            if (number < 0){
//                foundNegetive = true;
//            }else {
//                foundNegetive = false;
//            }
//        }
//
//        System.out.println("sum: " + sum);
//        System.out.println("negative numbers found: ");
//        if (foundNegetive){
//            System.out.println("yes");
//        }else {
//            System.out.println("no");
//        }

        //Отпечатване на азбуката на конзолата
//
        //въвеждат ни един ред a1b2c, задачата ни е да изведем цифрите от този ред
//

        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= num; i++) {
            int sum = 0; int actualNum = i;
            while (i > 0) {
                sum += i % 10; i = i / 10;
            }
            boolean trueFalse = (sum == 5) || (sum == 7) || (sum == 11);
            String tF;
            if (trueFalse) {
                tF = "True";
            } else {
                tF = "False";
            }
            System.out.printf("%d -> %s%n", actualNum, tF);
            i = actualNum;
        }


    }

}


