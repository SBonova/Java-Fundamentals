package bg.MoreExercise;

import java.util.Scanner;

public class LiveDemoMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // String name = "George";
        //  int age = Integer.parseInt(scanner.nextLine());

//        if (age >= 18){
//            System.out.println(name + "not allowed to enter");
//        }else {
//            System.out.println(name + "is allowed to enter");
//        }

//        String usualEducationType;
//        if (age >= 18){
//            usualEducationType = "university";
//        }else if (age >= 14){
//            usualEducationType = "high-school";
//        }else if (age >= 7){
//            usualEducationType = "school";
//        }else {
//            usualEducationType = "unknown";
//        }
//        System.out.println(usualEducationType);

//        int hours = scanner.nextInt();
//        int minutes = scanner.nextInt();
//
//        minutes += 30;
//        if (minutes >= 60){
//            minutes -= 60;
//            hours++;
//
//            if (hours >= 24){
//                hours -=24;
//            }
//        }
//        System.out.printf("%d:%02d%n",hours, minutes);

//        int digit = Integer.parseInt(scanner.nextLine());
//        String digitName = "";
//
//        if (digit == 0){
//            digitName = "zero";
//        }else if (digit == 1) {
//            digitName = "one";
//        }else if (digit == 2) {
//            digitName = "two";
//        }else if (digit == 3) {
//            digitName = "tree";
//        }else if (digit == 4) {
//            digitName = "fore";
//        }

// Loops
        int count = Integer.parseInt(scanner.nextLine());

        int printedCount = 0;
        int number = 0;
        while (printedCount < count) {
            number++;
           if (number % 2 == 1) {
               System.out.println(number);
           }
        }
    }
}
