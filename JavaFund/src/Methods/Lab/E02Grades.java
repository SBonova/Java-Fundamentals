package Methods.Lab;

import java.util.Scanner;

public class E02Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());
        printInWords(grade);
    }

    private static void printInWords(double grade) {
        if (grade >= 5.50 && grade <= 6.00){
            System.out.println("Excellent");
        }else if (grade >= 4.50 && grade <= 5.49){
            System.out.println("Very good");
        }else if (grade >= 3.50 && grade <= 4.49){
            System.out.println("Good");
        }else if (grade >= 3.00 && grade <= 3.49){
            System.out.println("Poor");
        }else if (grade >= 2.00 && grade <= 2.99){
            System.out.println("Fail");
        }
    }
}
