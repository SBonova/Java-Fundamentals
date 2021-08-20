package Methods.Examse;

import java.util.Scanner;

public class E10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Read an integer n from the console.
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= n; i++) {
            if (divisibleByEight(i) && oddDigit(i)){
                System.out.println(i);
            }
        }

    }

    static boolean divisibleByEight(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        if (sum % 8 == 0) {
            return true;
        } else {
            return false;
        }
    }

    static boolean oddDigit(int n) {
        int counter = 0;
        while (n > 0) {
            if ((n % 10) % 2 == 1) {
                counter++;
            }
            n /= 10;
        }
        if (counter >= 1){
            return true;
        }else {
            return false;
        }
    }
}
